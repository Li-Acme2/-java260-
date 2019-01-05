package 滚轴刻度;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class AdjustmentListenerDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		final JLabel jl=new JLabel("刻度:",JLabel.CENTER);
		final JScrollBar jsb=new JScrollBar(JScrollBar.VERTICAL,10,10,0,100);//设置滚动条属性。vertical:垂直的。第一个属性表示滚动条方向
		          //第二个表示滚动条初始值，第三个表示滚动条滑块的宽度；最后俩个参数指定滑动的上界和下界。
		jsb.setUnitIncrement(1);            //每点击knob（小块）一次滚动1个像素     //使用unit和block只是为了和awt的scroll保持api兼容
		jsb.setBlockIncrement(10);           //每点击track（轨道）一次就滚动十个像素
		jsb.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				if(e.getSource()==jsb){
					jl.setText("垂直刻度："+e.getValue());
				}
			}
		});
		c.add(jl,BorderLayout.NORTH);
		c.add(jsb,BorderLayout.EAST);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}











