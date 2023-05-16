package day10ifStatements;

import javax.swing.*;
import java.awt.*;

public class CopAdam extends JFrame {
    private int x = 100; // Çöp adamın başlangıç x konumu
    private int y = 100; // Çöp adamın başlangıç y konumu

    public CopAdam() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawOval(x, y, 30, 30); // Kafa
        g.drawLine(x + 15, y + 30, x + 15, y + 80); // Gövde
        g.drawLine(x, y + 40, x + 15, y + 60); // Sol kol
        g.drawLine(x + 30, y + 40, x + 15, y + 60); // Sağ kol
        g.drawLine(x + 15, y + 80, x, y + 120); // Sol bacak
        g.drawLine(x + 15, y + 80, x + 30, y + 120); // Sağ bacak


    }

    public void animate() {
        while (true) {
            x += 10; // Hareket hızı
            if (x >= getWidth())
                x = 0; // Ekranın sağ tarafına ulaşıldığında sola dön

            try {
                Thread.sleep(500); // Hareket aralığı
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint(); // Yeniden çiz
        }
    }

    public static void main(String[] args) {
        CopAdam copAdam = new CopAdam();
        copAdam.animate();
    }
}