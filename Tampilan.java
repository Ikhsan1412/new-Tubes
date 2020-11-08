import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tampilan extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan
     */
    public Tampilan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        GambarDisini = new javax.swing.JLabel();
        Potong = new javax.swing.JButton();
        Zoom = new javax.swing.JLabel();
        Rotasi = new javax.swing.JLabel();
        Cermin = new javax.swing.JLabel();
        CerminAtas = new javax.swing.JButton();
        CerminKiri = new javax.swing.JButton();
        KecerahanSlide = new javax.swing.JSlider();
        CheckKecerahan = new javax.swing.JCheckBox();
        gerakanRotasi = new javax.swing.JSlider();
        zoomSlider = new javax.swing.JSlider();
        MenuUtama = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadGambar = new javax.swing.JMenuItem();
        Keluar = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        Negatif = new javax.swing.JMenuItem();
        HitamPutih = new javax.swing.JMenuItem();
        Grayscale = new javax.swing.JMenuItem();

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GambarDisini.setBackground(new java.awt.Color(255, 0, 0));

        Potong.setText("Potong");
        Potong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotongActionPerformed(evt);
            }
        });

        Zoom.setText("Zoom");

        Rotasi.setText("Rotasi");

        Cermin.setText("Cermin");

        CerminAtas.setText("Atas");
        CerminAtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerminAtasActionPerformed(evt);
            }
        });

        CerminKiri.setText("Kiri");
        CerminKiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerminKiriActionPerformed(evt);
            }
        });

        KecerahanSlide.setMaximum(200);
        KecerahanSlide.setValue(100);
        KecerahanSlide.setEnabled(false);
        KecerahanSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aturKecerahan(evt);
            }
        });

        CheckKecerahan.setText("Mode kecerahan");
        CheckKecerahan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                statusCekKecerahan(evt);
            }
        });

        gerakanRotasi.setValue(0);
        gerakanRotasi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gerakanRotasiStateChanged(evt);
            }
        });

        zoomSlider.setMaximum(200);
        zoomSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        zoomSlider.setValue(100);
        zoomSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomSliderStateChanged(evt);
            }
        });

        jMenu1.setAction(jMenu1.getAction());
        jMenu1.setText("File");

        LoadGambar.setText("Load Gambar");
        LoadGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadGambarActionPerformed(evt);
            }
        });
        jMenu1.add(LoadGambar);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jMenu1.add(Keluar);

        MenuUtama.add(jMenu1);

        EditMenu.setText("Edit");

        Negatif.setText("Negatif");
        Negatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegatifActionPerformed(evt);
            }
        });
        EditMenu.add(Negatif);

        HitamPutih.setText("Hitam Putih");
        HitamPutih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitamPutihActionPerformed(evt);
            }
        });
        EditMenu.add(HitamPutih);

        Grayscale.setText("Grayscale");
        Grayscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayscaleActionPerformed(evt);
            }
        });
        EditMenu.add(Grayscale);

        MenuUtama.add(EditMenu);

        setJMenuBar(MenuUtama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KecerahanSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(CerminAtas)
                                .addGap(37, 37, 37)
                                .addComponent(CerminKiri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gerakanRotasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckKecerahan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cermin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rotasi)
                                .addGap(81, 81, 81))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zoomSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Zoom))
                                .addGap(18, 18, 18)
                                .addComponent(GambarDisini, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(Potong, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Zoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoomSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Potong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GambarDisini, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cermin)
                            .addComponent(CheckKecerahan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CerminAtas)
                                .addComponent(CerminKiri))
                            .addComponent(KecerahanSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rotasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerakanRotasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void LoadGambarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JFileChooser gbr = new JFileChooser();
        if(gbr.showOpenDialog(GambarDisini)==JFileChooser.APPROVE_OPTION){
            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(gbr.getSelectedFile().getAbsolutePath());
            Image imageResized=image.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
            //String imageResized = null;
            ImageIcon imageIcon=new ImageIcon(imageResized);
            
            GambarDisini.setIcon(imageIcon);
        }
        direktori(gbr.getSelectedFile().getAbsolutePath());
        mirorKiri = false;
        mirorAtas = false;
    }                                          

    private void direktori(String dir){
        String temp = dir;
        String newDir = temp.replace("\\", "\\\\");
        ImgDir = newDir;
    }
    
    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {                                       
         System.exit(0);  // TODO add your handling code here:
    }                                      

    private void PotongActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //WOOOH INPUT PEMOTONGAN PAK!
        JTextField cropAtas = new JTextField();
        JTextField cropBawah = new JTextField();
        JTextField cropKiri = new JTextField();
        JTextField cropKanan = new JTextField();

        Object[] cropping = {
            "Potong atas: ", cropAtas,
            "Potong bawah: ", cropBawah,
            "Potong kiri: ", cropKiri,
            "Potong kanan: ", cropKanan
        };

        int atas = 0;
        int bawah = 0;
        int kiri = 0;
        int kanan = 0;

        int isian = JOptionPane.showConfirmDialog(null, cropping, "Masukkan data!", JOptionPane.OK_CANCEL_OPTION);
        if(isian == JOptionPane.OK_OPTION){
            if(cropAtas.getText().matches("^[0-9]*$") && cropBawah.getText().matches("^[0-9]*$") && cropKiri.getText().matches("^[0-9]*$") && cropKanan.getText().matches("^[0-9]*$")){
                if((atas+bawah) > 450 || (kiri + kanan) > 550){
                    JOptionPane.showMessageDialog(null, "Tolong masukkan angka yang lebih kecil");
                }else{
                    atas = Integer.parseInt(cropAtas.getText());
                    bawah = Integer.parseInt(cropBawah.getText());
                    kiri = Integer.parseInt(cropKiri.getText());
                    kanan = Integer.parseInt(cropKanan.getText());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Masukkan angka saja!");
            }
        }

        //MULAI RUBAH CITRA COEK
        BufferedImage img = getFiles();
        BufferedImage cut = img.getSubimage(kiri, atas, kanan, bawah);
        Image resized = cut.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                      

    private void HitamPutihActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        //Pemasukan treshold
        String string;
        String inputHitput = "";
        do{
            string = JOptionPane.showInputDialog("Masukan treshold!");
            if(string.matches("^[0-9]*$")){
                inputHitput = string;
            }else{
                JOptionPane.showMessageDialog(null, "Masukkan angka saja!");
            }
        }while(!inputHitput.matches("^[0-9]*$"));
        int treshold = Integer.parseInt(inputHitput);
        //Perubahan citra
        BufferedImage img = getFiles();
        for(int y = 0; y < imgHeight; y++){
            for(int x = 0; x < imgWidth; x++){
              int p = img.getRGB(x,y);
      
              int a = (p>>24)&0xff;
              int r = (p>>16)&0xff;
              int g = (p>>8)&0xff;
              int b = p&0xff;
              int avg = (r+g+b)/3;                                                    //Ini hasil rata-rata dari nilai argb buat dimasukin nanti
      
              if(avg > treshold){
                  r = g = b = 255;
              }else{
                  r = g = b = 0;
              }
              p = (a<<24) | (r<<16) | (g<<8) | b;                               //ini masukin warna baru ke gambar
      
              //Ini tresholdnya 120 jadi pake syarat kalo di atas 120 rgb dibikin 255/putih kalo di bawah dibikin 0/hitam
      
              img.setRGB(x, y, p);
            }
        }

        //Menampilkan citra
        Image resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                          

    private void NegatifActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        //Perubahan citra
        BufferedImage img = getFiles();
        for(int y = 0; y < imgHeight; y++){
            for(int x = 0; x < imgWidth; x++){
              int p = img.getRGB(x,y);
      
              int a = (p>>24)&0xff;
              int r = (p>>16)&0xff;
              int g = (p>>8)&0xff;
              int b = p&0xff;
      
              r = 255 - r;
              g = 255 - g;
              b = 255 - b;
              //Semua piksel harus pake rumus 255 - rgb biar dapet warna negatifnya
              p = (a<<24) | (r<<16) | (g<<8) | b;                               //ini masukin warna baru ke gambar
      
              img.setRGB(x, y, p);
            }
        }

        //Menampilkan citra
        Image resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                       

    private void GrayscaleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        //Perubahan citra
        BufferedImage img = getFiles();
        for(int y = 0; y < imgHeight; y++){
            for(int x = 0; x < imgWidth; x++){
              int p = img.getRGB(x,y);
      
              int a = (p>>24)&0xff;
              int r = (p>>16)&0xff;
              int g = (p>>8)&0xff;
              int b = p&0xff;
              int avg = (r+g+b)/3;                                                    //Ini hasil rata-rata dari nilai argb buat dimasukin nanti
  
              p = (a<<24) | (avg<<16) | (avg<<8) | avg;                               //ini masukin warna baru ke gambar
      
              //Ini tresholdnya 120 jadi pake syarat kalo di atas 120 rgb dibikin 255/putih kalo di bawah dibikin 0/hitam
      
              img.setRGB(x, y, p);
            }
          }

          //Menampilkan
          Image resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
          ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                         

    private void CerminAtasActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        //Perubahan citra
        BufferedImage img = getFiles();

        Image resized = null;
        BufferedImage flipImg = new BufferedImage(imgWidth, imgHeight, img.getType());

        //fungsi afine transform
        AffineTransform tran = AffineTransform.getTranslateInstance(0, imgHeight);
        AffineTransform flip = AffineTransform.getScaleInstance(1d, -1d);
        tran.concatenate(flip);

        Graphics2D g = flipImg.createGraphics();
        g.setTransform(tran);
        g.drawImage(img, 0, 0, null);
        g.dispose();

        if(mirorAtas == false){
            resized = flipImg.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
            mirorAtas = true;
        }else if(mirorAtas == true){
            resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
            mirorKiri = false;
        }
        
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                          

    private void CerminKiriActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        //Perubahan citra
        BufferedImage img = getFiles();

        Image resized = null;
        BufferedImage mimg = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);
        //create mirror image pixel by pixel
        for(int y = 0; y < imgHeight; y++){
            for(int lx = 0, rx = imgWidth - 1; lx < imgWidth; lx++, rx--){
                //lx mulai dari sisi kiri, rx dari kanan
                int p = img.getRGB(lx, y);
                mimg.setRGB(rx, y, p);
            }
        }
        if(mirorKiri == false){
            resized = mimg.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
            mirorKiri = true;
        }else if(mirorKiri == true){
            resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
            mirorKiri = false;
        }
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                          

    private void aturKecerahan(javax.swing.event.ChangeEvent evt) {                               
        // TODO add your handling code here:
        //Pemasukan treshold
        int temp = KecerahanSlide.getValue();
        int treshold = temp - 100;

        //Perubahan citra
        BufferedImage img = getFiles();
        for(int y = 0; y < imgHeight; y++){
            for(int x = 0; x < imgWidth; x++){
              int p = img.getRGB(x,y);
      
              int a = (p>>24)&0xff;
              int r = (p>>16)&0xff;
              int g = (p>>8)&0xff;
              int b = p&0xff;
      
              r = r + treshold;
              g = g + treshold;
              b = b + treshold;
              if(r > 255){
                r = 255;
              }
              if(g > 255){
                g = 255;
              }
              if(b > 255){
                b = 255;
              }
              if(r < 0){
                r = 0;
              }
              if(g < 0){
                g = 0;
              }
              if(b < 0){
                b = 0;
              }
              //Harus pake syarat batas... gw lagi cari cara buat nyederhanain
      
              p = (a<<24) | (r<<16) | (g<<8) | b;                             //ini masukin warna baru ke gambar
      
              img.setRGB(x, y, p);
            }
        }

        Image resized = img.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                              

    private void statusCekKecerahan(javax.swing.event.ChangeEvent evt) {                                    
        // TODO add your handling code here:
        if(CheckKecerahan.isSelected()){
            KecerahanSlide.setEnabled(true);
        }else{
            KecerahanSlide.setEnabled(false);
        }
    }                                   

    private void gerakanRotasiStateChanged(javax.swing.event.ChangeEvent evt) {                                           
        // TODO add your handling code here:   
        Image resized = null;
        BufferedImage img = getFiles();
        double angle = 720d * (gerakanRotasi.getValue() / 100d);
        double rads = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(rads)), cos = Math.abs(Math.cos(rads));
        int w = imgWidth;
        int h = imgHeight;
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = null;
        rotated = new BufferedImage(newWidth, newHeight, img.getType());
        Graphics2D g2d = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((newWidth - w) / 2, (newHeight - h) / 2);

        int x, y;
        if(imgHeight%2 != 0 || imgWidth%2 != 0){
            x = Math.round(imgWidth/2);
            y = Math.round(imgHeight/2);
        }else{
            x = imgWidth/2;
            y = imgWidth/2;
        }
        at.rotate(rads, x, y);
        g2d.setTransform(at);
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();

        resized = rotated.getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                          

    private void zoomSliderStateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO add your handling code here:
        int temp = zoomSlider.getValue();
        int zoom = temp-100;

        BufferedImage img = getFiles();
        Image resized = null;
        int newWidth = 550 - zoom;
        int newHeight = 450 - zoom;

        resized = img.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(resized);
        GambarDisini.setIcon(icon);
    }                                       

    //Method?
    private BufferedImage getFiles() {
        BufferedImage img = null;
        File f = null;

        try{
            f = new File(ImgDir);            
            img = ImageIO.read(f);
          }catch(IOException e){
            System.out.println(e);                                           
          }

          imgWidth = img.getWidth();
          imgHeight = img.getHeight();

          return img;
    }
    
    //Variabel yang mungkin bantu... entahlah
    String ImgDir;
    boolean mirorKiri;
    boolean mirorAtas;
    int imgWidth;
    int imgHeight;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Cermin;
    private javax.swing.JButton CerminAtas;
    private javax.swing.JButton CerminKiri;
    private javax.swing.JCheckBox CheckKecerahan;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JLabel GambarDisini;
    private javax.swing.JMenuItem Grayscale;
    private javax.swing.JMenuItem HitamPutih;
    private javax.swing.JSlider KecerahanSlide;
    private javax.swing.JMenuItem Keluar;
    private javax.swing.JMenuItem LoadGambar;
    private javax.swing.JMenuBar MenuUtama;
    private javax.swing.JMenuItem Negatif;
    private javax.swing.JButton Potong;
    private javax.swing.JLabel Rotasi;
    private javax.swing.JLabel Zoom;
    private javax.swing.JSlider gerakanRotasi;
    private javax.swing.JMenu jMenu1;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JSlider zoomSlider;
    // End of variables declaration                   
}
