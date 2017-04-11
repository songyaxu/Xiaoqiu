package caisetanqiu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * @author songyx
 *
 */
@SuppressWarnings("serial")

public class Xiaoqiu extends JFrame implements ActionListener{

    private final int OVAL_WIDTH = 50;
	private final int OVAL_HEIGHT = 50;
	private Timer timer;//��ʱ��
	private int timeSum=0;//������ִ�д���
	private boolean boderx1=false;//ͼ��һx�������ж�
	private boolean boderx2=false;//ͼ�ζ�x�������ж�
	private boolean boderx3=false;//ͼ����x�������ж�
	private boolean bodery1=false;//ͼ��һy�������ж�
	private boolean bodery2=false;//ͼ�ζ�y�������ж�
	private boolean bodery3=false;//ͼ����y�������ж�
	private double a=1;//�ƶ�������
	public Xiaoqiu(){
		super();
		initialize();
		move();
	}
	private void initialize(){
		this.setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		setContentPane(panel);
		panel.setBackground(Color.black);//���ñ�����ɫ
		this.setTitle("��ɫ����");
		this.setResizable(false);
		this.setLocation(500, 200);
	}
	private void move()
	{
		timer = new Timer(1, this);  //ÿ1���붯һ��
        timer.start();  
        setVisible(true); 
	}
	public static void main(String[] args){
		new Xiaoqiu().setVisible(true);
	}
		int x1 =new Random().nextInt(99)+25;//ͼ��1��ʼx����
		int y1 =new Random().nextInt(99)+25;//ͼ��1��ʼy����
		int speedx1 = new Random().nextInt(10)+1;//ͼ��1�������x�����е��ٶ�
		int speedy1 = new Random().nextInt(10)+1;//ͼ��1�������y�����е��ٶ�
		int x2 =new Random().nextInt(99)+25;//ͼ��2��ʼx����
		int y2 =new Random().nextInt(99)+25;//ͼ��2��ʼy����
		int speedx2 = new Random().nextInt(10)+1;//ͼ��2�������x�����е��ٶ�
		int speedy2 = new Random().nextInt(10)+1;//ͼ��2�������y�����е��ٶ�
		int x3 =new Random().nextInt(99)+25;//ͼ��3��ʼx����
		int y3 =new Random().nextInt(99)+25;//ͼ��3��ʼy����
		int speedx3 = new Random().nextInt(10)+1;//ͼ��3�������x�����е��ٶ�
		int speedy3 = new Random().nextInt(10)+1;//ͼ��3�������y�����е��ٶ�
		Color color1 = new Color(
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128);
		Color color2 = new Color(
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128);
		Color color3 = new Color(
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128,   
		          (new Double(Math.random() * 128)).intValue() + 128);
		public void paint(Graphics g){
			super.paint(g);
			g.setColor(color1);
			g.fillOval(x1,y1,OVAL_WIDTH, OVAL_HEIGHT);
			g.setColor(color2);
			g.fillOval(x2,y2,OVAL_WIDTH, OVAL_HEIGHT);
			g.setColor(color3);
			g.fillOval(x3,y3,OVAL_WIDTH, OVAL_HEIGHT);
			}
		/*��ʱ������*/
		@Override
		public void actionPerformed(ActionEvent e) {
			timeSum++;
			if(timeSum%10000==0&&a!=0)//�ٶȻ�Խ��
				a-=0.01;
			if(timeSum%speedx1==0)
			{
				if(x1>=0&&!boderx1)
				{
					x1+=a;
					if(x1==350-50)
						boderx1=true;
				}
				else
				{
					x1-=a;
					if(x1==0)
						boderx1=false;
				}
			}
			if(timeSum%speedy1==0)
			{
				if(y1>=25&&!bodery1)
				{
					y1+=a;
					if(y1==350-50)
						bodery1=true;
				}
				else
				{
					y1-=a;
					if(y1==25)
						bodery1=false;
				}
			}
			if(timeSum%speedx2==0)
			{
				if(x2>=0&&!boderx2)
				{
					x2+=a;
					if(x2==350-50)
						boderx2=true;
				}
				else
				{
					x2-=a;
					if(x2==0)
						boderx2=false;
				}
			}
			if(timeSum%speedy2==0)
			{
				if(y2>=25&&!bodery2)
				{
					y2+=a;
					if(y2==350-50)
						bodery2=true;
				}
				else
				{
					y2-=a;
					if(y2==25)
						bodery2=false;
				}
			}
			if(timeSum%speedx3==0)
			{
				if(x3>=0&&!boderx3)
				{
					x3+=a;
					if(x3==350-50)
						boderx3=true;
				}
				else
				{
					x3-=a;
					if(x3==0)
						boderx3=false;
				}
			}
			if(timeSum%speedy3==0)
			{
				if(y3>=25&&!bodery3)
				{
					y3+=a;
					if(y3==350-50)
						bodery3=true;
				}
				else
				{
					y3-=a;
					if(y3==25)
						bodery3=false;
				}
			}
			repaint();//�ػ�
		}
	}
