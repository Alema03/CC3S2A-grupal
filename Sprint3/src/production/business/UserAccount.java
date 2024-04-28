package production.business;

public class UserAccount {
	
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public UserAccount() {	
	}
	
	public static String checkInputError(String userName, String password, String firstName, String lastName, String email, String phone){
		String errorMessage ="";
		if (!isUserNameValid(userName))
				errorMessage += "Nombre de usuario invalido.\n";
		if (!isPasswordValid(password))
				errorMessage += "Contraseña invalida.\n";
		if (!isFirstNameValid(firstName))
			errorMessage += "Nombre invalido.\n";
		if (!isLastNameValid(lastName))
			errorMessage += "Apellido Invalido.\n";
		if (!isEmailValid(email))
			errorMessage += "Email Invalido.\n";
		if (!isPhoneNumberValid(phone))
			errorMessage += "Numero de telefono invalido.\n";
		return errorMessage;
	}
	
	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}


	public static boolean isUserNameValid(String userName){
		// comprobar si el nombre de usuario es válido
		
		if(userName.contains(" ") || !userName.matches("^[A-Za-z][A-Za-z0-9]*$"))
			return false;
		
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	


	public static boolean isPasswordValid(String password){
		//comprobar si la contraseña es válida
		
		if(password.length()<6 || !password.matches(".*[@#$^&]+.*$") || !password.matches(".*[0-9]+.*$") || !password.matches(".*[a-z]+.*$") || !password.matches(".*[A-Z]+.*$"))
				return false;
		
		return true;
	}

    public boolean isValidCredential(String userName, String password) {
         return matchUserName(userName) && matchPassword(password);
    }
    
    public boolean matchUserName(String userName) {
         return userName != null && userName.equalsIgnoreCase(this.userName);
    }
    
    private boolean matchPassword(String password) {
        return password != null && password.equals(this.password);
   }

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}


	public static boolean isFirstNameValid(String firstName){
		// comprobar si el nombre es válido
		
		if(!firstName.matches("^[A-Za-z]*$"))
			return false;
		
		return true;
	}
	
	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}


	public static boolean isLastNameValid(String lastName){
		// comprueba si el apellido es válido
		
		if(!lastName.matches("^[A-Za-z]*$"))
			return false;
		
		return true;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}


	public static boolean isEmailValid(String email){
		//comprobar si el correo electrónico es válido
		
		if(!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"))
			return false;
		
		return true;
	}

	public String getPhoneNumber(){
		return phone;
	}

	public void setPhoneNumber(String phone){
		this.phone = phone;
	}


	public static boolean isPhoneNumberValid(String phone){
		// comprobar si el teléfono (número) es válido
		
		if(phone.length()!=9 || !phone.matches("^[0-9]*$"))
			return false;
		
		return true;
	}


}
