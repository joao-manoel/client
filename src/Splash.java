import javax.swing.*;


import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
 
@SuppressWarnings("serial")
public class Splash extends JFrame {
/*
	private static String downloadUrl = "https://github.com/Ressurge/client/raw/master/download/Ressurge.jar";
	private static String fileName = "Ressurge.jar";
	private static String serverName = "Ressurge";
	private static String backgroundImageUrl = "https://i.imgur.com/aLgOhDB.jpg";
	private static String saveDirectory = System.getProperty("user.home")+"/";
	 
	public static URL url;
    private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    Thread t = null;
 
    public Splash() {
        super("Splash");
        
        File file = new File(saveDirectory + fileName);
        
		try {
			url = new URL(downloadUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
        setSize(543, 391);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        
        try {
			img = new ImageIcon(new URL(backgroundImageUrl));
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
        
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.LIGHT_GRAY);
        imglabel.setBounds(0, 0, 543, 391);
        add(pbar);
        pbar.setPreferredSize(new Dimension(310, 30));
        pbar.setBounds(70, 320, 404, 20);


        try {
            if (file.exists()) {
            	URLConnection connection = url.openConnection();
            	connection.connect();
    			long time = connection.getLastModified();
    			if (time > file.lastModified()) {
                    if (!startDialogue()) {
                    	startApplication();
                        return;
                    }
    			} else {
                    setVisible(true);
                    Thread.sleep(3000);
                    startApplication();
                    return;
                }
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Thread t = new Thread() {
 
            public void run() {
            	OutputStream dest = null;
            	URLConnection download;
            	InputStream readFileToDownload = null;
            	try {
            		dest = new BufferedOutputStream(new FileOutputStream(saveDirectory + fileName)); 
            		download = url.openConnection();
            		readFileToDownload = download.getInputStream();
            		byte[] data = new byte[1024];
            		int numRead;
            		long numWritten = 0;
            		int length = download.getContentLength();
            		while ((numRead = readFileToDownload.read(data)) != -1) {
            			dest.write(data, 0, numRead);
            			numWritten += numRead;
            			int percent = (int)(((double)numWritten / (double)length) * 100D);
            			pbar.setValue(percent);
            			pbar.setString(""+(percent < 99 ? "Downloading "+serverName+" - "+percent+"%" : "Complete")+"");
            		}
            	} catch (Exception exception) {
            		exception.printStackTrace();
            	} finally {
            		try {
            			if (readFileToDownload != null)
            				readFileToDownload.close();
            			if (dest != null)
            				dest.close();
            			Thread.sleep(1000L);
            			startApplication();
            		} catch (Throwable ioe) {
            				
            		}
            	}
            }
        };
        t.start();
    }
    
    public boolean startDialogue() {
        setVisible(true);
        int selection = JOptionPane.showConfirmDialog(null, "An update is available. Do you wish to download?", "Update Available", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        return selection == JOptionPane.OK_OPTION;
    }


    /**
     * Launches the downloaded Jar file and closes the progress bar
     
    public static void startApplication() {
    	try {
			Runtime.getRuntime().exec("java -jar "+(saveDirectory + fileName)+"");
			Thread.sleep(1000L);
			System.exit(0);
		} catch (Throwable e) {
			e.printStackTrace();
		}
    }*/


}