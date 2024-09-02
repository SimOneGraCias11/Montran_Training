
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CropScanner {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);


        JFrame frame = new JFrame("Crop Scanner");
        JPanel panel = new JPanel();
        JButton uploadButton = new JButton("Upload Image");
        JLabel imageLabel = new JLabel();


        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();   


                int result = fileChooser.showOpenDialog(frame);


                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();   


                    Mat image = Imgcodecs.imread(selectedFile.getAbsolutePath());


                    // Preprocessing (e.g., grayscale conversion, noise reduction)
                    Mat grayImage = new Mat();
                    Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);


                    // ID card localization (e.g., template matching, feature-based methods, contour analysis)


                    // Cropping
                    Rect roi = new Rect(x, y, width, height); // Replace with calculated coordinates
                    Mat croppedImage = new Mat(image, roi);


                    // Display cropped image
                    ImageIcon icon = new ImageIcon(croppedImage.getBufferedImage());
                    imageLabel.setIcon(icon);
                }
            }
        });


        panel.add(uploadButton);
        panel.add(imageLabel);
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}