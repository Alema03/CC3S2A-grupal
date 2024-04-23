package production.gui;

import production.business.AmericanCheckersGame;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class AmericanCheckersGUI extends JFrame {

    public static final int CELL_SIZE = 100;

    public static final int CELL_PADDING = CELL_SIZE / 6;
    public static final int SYMBOL_SIZE = CELL_SIZE - CELL_PADDING * 2;
    public static final int SYMBOL_STROKE_WIDTH = 8;

    private GameBoardCanvas gameBoardCanvas;

    private AmericanCheckersGame game;

    public AmericanCheckersGUI() {
        this(new AmericanCheckersGame());
    }

    public AmericanCheckersGUI(AmericanCheckersGame game) {
        this.game = game;
        setContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setTitle("Juego de damas: QUEENSPLAY");
        setVisible(true);
    }

    private void setContentPane() {
        gameBoardCanvas = new GameBoardCanvas();
        gameBoardCanvas
                .setPreferredSize(new Dimension(CELL_SIZE * game.getTotalRows(), CELL_SIZE * game.getTotalColumns()));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(gameBoardCanvas, BorderLayout.CENTER);
    }

    class GameBoardCanvas extends JPanel {

        GameBoardCanvas() {}

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.WHITE);
            drawBoard(g);
        }

        private void drawBoard(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(SYMBOL_STROKE_WIDTH, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

            for (int row = 0; row < game.getTotalRows(); ++row) {
                for (int col = 0; col < game.getTotalColumns(); ++col) {
                    int x1 = col * CELL_SIZE + CELL_PADDING;
                    int y1 = row * CELL_SIZE + CELL_PADDING;

                    if((row+col)%2==1)
                    {
                        g2d.setColor(Color.GREEN.darker());
                        g2d.drawRoundRect(x1-12,y1-13,94,94,0,0);
                        g2d.fillRoundRect(x1-12,y1-13,94,94,0,0);
                    }
                    if (game.getCheckersPiece(row, col) != null && game.getCheckersPiece(row, col).getColor() == "BLACK") {
                        g2d.setColor(Color.BLACK);
                        g2d.drawOval(x1, y1, SYMBOL_SIZE, SYMBOL_SIZE);
                        g2d.fillOval(x1, y1, SYMBOL_SIZE, SYMBOL_SIZE);
                    } else if (game.getCheckersPiece(row, col) != null && game.getCheckersPiece(row, col).getColor() == "RED") {
                        g2d.setColor(Color.RED);
                        g2d.drawOval(x1, y1, SYMBOL_SIZE, SYMBOL_SIZE);
                        g2d.fillOval(x1, y1, SYMBOL_SIZE, SYMBOL_SIZE);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AmericanCheckersGUI();
            }
        });
    }
}

