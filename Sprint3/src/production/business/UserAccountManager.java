package production.business;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserAccountManager {
	
	public static final String NOINPUTERROR ="";
	
    private ArrayList<UserAccount> userAccounts;
    
	static Connection connection=null;
	static PreparedStatement ps=null;
	
	static String database="american_checkers";
	static String url="jdbc:mysql://localhost:3306/"+database;

	static String user="root";
	static String passwd="mcrx990014157";
	String query;
    
    public UserAccountManager() {
    	//Conexiones a la base de datos
        userAccounts = new ArrayList<UserAccount>();
        
       // Class.forName("com.mysql.jdbc.Driver");
			
        try {
			connection=DriverManager.getConnection(url,user,passwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	// devuelve una cadena vacía si el registro del usuario es exitoso (todas las entradas son válidas)
	// de lo contrario, aparecerá un mensaje de error.
    public String registerNewUser(String userName, String password, String reenteredPassword, 
    		String firstName, String lastName, String email, String phone){
    		
    	
    	String inputCheckResult = UserAccount.checkInputError(userName, password, firstName, lastName, email, phone);
    		
    		if (!inputCheckResult.equals(""))
    			return inputCheckResult;
    		if 	(doesUserNameExist(userName))
    			return "¡Nombre de usuario no esta disponible!";
    		if (!password.equals(reenteredPassword)) {
    			return "¡Las contraseñas no coincide!";
    		}
    		

    		UserAccount newAccount = new UserAccount();
    		setAccountProfile(newAccount, userName, password, firstName, lastName, email, phone);

		//userAccounts.add(newAccount);
		//no es necesario setAccountProfile
		// consulta SQL para insertar usuario en la tabla
    		
    		query="INSERT INTO `american_checkers`.`registration`(`username`,`passwordd`,`reenterpasswd`,`firstname`,`lastname`,`email`,`phone`)"
    				+ "VALUES(?,?,?,?,?,?,?);";   		
    		try {
    			connection=DriverManager.getConnection(url,user,passwd);
				ps=connection.prepareStatement(query);
				
				ps.setString(1, userName);
				ps.setString(2, password);
				ps.setString(3, reenteredPassword);
				ps.setString(4, firstName);
				ps.setString(5, lastName);
				ps.setString(6, email);
				ps.setString(7, phone);
				
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    		return NOINPUTERROR;
    }

    private void setAccountProfile(UserAccount userAccount, String userName, String password, String firstName, String lastName, String email, String phone){
		userAccount.setUserName(userName);
		userAccount.setPassword(password);
		userAccount.setFirstName(firstName);
		userAccount.setLastName(lastName);
		userAccount.setEmail(email);
		userAccount.setPhoneNumber(phone);
    }
    
    public int login(String userName, String password) {
    	try {
    		connection=DriverManager.getConnection(url,user,passwd);
    		Statement stm=connection.createStatement();
        	query="select * from registration where username='"+userName+"' and passwordd='"+password+"';";
        	
			ResultSet rs=stm.executeQuery(query);
			if(rs.next())
			{
				return 1;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return 0;
    }
    
    public boolean doesUserNameExist(String userName){
		// consulta SQL para comprobar si el usuario existe o no
    		for (UserAccount userAccount: userAccounts)
    			if(userAccount.matchUserName(userName))   
    				return true;   
    		return false;
    }
    
}
