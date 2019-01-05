package  ±÷”≥Ã–Ú;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class DigitalClock extends JFrame implements Runnable{
	private Thread time;
	private JLabel clock;
	private SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
	public DigitalClock(){
		init();
		start();
	}
	public void init(){
		this.setTitle("Digital Clock");
		this.setSize(200, 100);
		this.setLocationRelativeTo(null);
		this.add(createLabel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void start(){
		if(time==null){
			time=new Thread(this);
			time.start();
		}
	}
	public void stop(){
		time=null;
	}
	public JLabel createLabel(){
		clock=new JLabel(format.format(new Date()),JLabel.CENTER);
		clock.setFont(new Font("Times New Roman",Font.BOLD,40));
		clock.setForeground(Color.BLUE);
		return clock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (time!=null){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			clock.setText(format.format(new Date()));
		}
	}
	public static void main(String[] args){
		new DigitalClock();
	}

}
