package n01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class N01 extends JFrame {

	JTextArea ���_3 = new JTextArea();
	JLabel ��� = new JLabel("\uC815\uADDC\uAC70\uB798\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
	int[] money_sell = new int[5];// ���� �ǸŰ�
	int[] money_get = new int[5];// ���� ���Ű�
	int[] chang = new int[5];// ��ȭ��
	int num;// ���� �ֽ� �ε��� ��
	int debt = 0;// ��
	// ��� ���� �Ѱ�°��� ���� �ſ뵵�� �޶���
	int click = 0;
	int level = 5;// �ſ뵵
	int mywallet = 100000;// �� ����
	int[] suick = new int[5];// ����
	int[] suicknum = { 0, 0, 0, 0, 0 };
	static int[] ju = { 0, 0, 0, 0, 0 };
	int[] jusick = { 10000, 20000, 30000, 40000, 50000 };

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) throws Exception {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					N01 frame = new N01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */

	public N01() throws IOException {

		String filePath1 = "D://java_workspace//Project//src//n01//���ֽ�_����.txt"; // ��� ����
		String filePath2 = "D://java_workspace//Project//src//n01//���ֽ�_����.txt"; // ��� ����
		String filePath3 = "D://java_workspace//Project//src//n01//���ֽ�_����.txt"; // ��� ����
		String filePath4 = "D://java_workspace//Project//src//n01//���ֽ�_����.txt"; // ��� ����
		String filePath5 = "D://java_workspace//Project//src//n01//���ֽ�_����.txt"; // ��� ����
		String filePath6 = "D://java_workspace//Project//src//n01//����_����.txt"; // ��� ����
		String filePath7 = "D://java_workspace//Project//src//n01//��_����.txt"; // ��� ����
		FileInputStream fileStream1 = null; // ���� ��Ʈ��
		FileInputStream fileStream2 = null; // ���� ��Ʈ��
		FileInputStream fileStream3 = null; // ���� ��Ʈ��
		FileInputStream fileStream4 = null; // ���� ��Ʈ��
		FileInputStream fileStream5 = null; // ���� ��Ʈ��
		FileInputStream fileStream6 = null; // ���� ��Ʈ��
		FileInputStream fileStream7 = null; // ���� ��Ʈ��
		String[] a_1 = { "0" };
		String[] a_2 = { "0" };
		String[] a_3 = { "0" };
		String[] a_4 = { "0" };
		String[] a_5 = { "0" };
		String[] a_6 = { "0" };
		String[] a_7 = { "0" };
		int i = 0;
		try {
			// ����Ʈ ������ �����б�
			fileStream1 = new FileInputStream(filePath1);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer = new byte[fileStream1.available()];
			while (fileStream1.read(readBuffer) != -1) {
			}
			a_1[i] = new String(readBuffer); // ���
			fileStream1.close(); // ��Ʈ�� �ݱ�
			fileStream2 = new FileInputStream(filePath2);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer2 = new byte[fileStream2.available()];
			while (fileStream2.read(readBuffer2) != -1) {
			}
			a_2[i] = new String(readBuffer2); // ���
			fileStream2.close(); // ��Ʈ�� �ݱ�
			fileStream3 = new FileInputStream(filePath3);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer3 = new byte[fileStream3.available()];
			while (fileStream3.read(readBuffer3) != -1) {
			}
			a_3[i] = new String(readBuffer3); // ���
			fileStream3.close(); // ��Ʈ�� �ݱ�
			fileStream4 = new FileInputStream(filePath4);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer4 = new byte[fileStream4.available()];
			while (fileStream4.read(readBuffer4) != -1) {
			}
			a_4[i] = new String(readBuffer4); // ���
			fileStream4.close(); // ��Ʈ�� �ݱ�
			fileStream5 = new FileInputStream(filePath5);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer5 = new byte[fileStream5.available()];
			while (fileStream5.read(readBuffer5) != -1) {
			}
			a_5[i] = new String(readBuffer5); // ���
			fileStream5.close(); // ��Ʈ�� �ݱ�
			fileStream6 = new FileInputStream(filePath6);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer6 = new byte[fileStream6.available()];
			while (fileStream6.read(readBuffer6) != -1) {
			}
			a_6[i] = new String(readBuffer6); // ���
			fileStream6.close(); // ��Ʈ�� �ݱ�
			fileStream7 = new FileInputStream(filePath7);
			byte[] readBuffer7 = new byte[fileStream7.available()];
			while (fileStream7.read(readBuffer7) != -1) {
			}
			a_7[i] = new String(readBuffer7); // ���
			fileStream7.close(); // ��Ʈ�� �ݱ�

		} catch (Exception e) {
			e.getStackTrace();
		}
		int b = Integer.parseInt(a_1[0]);
		ju[0] = b;
		b = Integer.parseInt(a_2[0]);
		ju[1] = b;
		b = Integer.parseInt(a_3[0]);
		ju[2] = b;
		b = Integer.parseInt(a_4[0]);
		ju[3] = b;
		b = Integer.parseInt(a_5[0]);
		ju[4] = b;
		b = Integer.parseInt(a_6[0]);
		mywallet = b;
		b = Integer.parseInt(a_7[0]);
		debt = b;
		
		JPanel panel_1_1 = new JPanel();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat format2 = new SimpleDateFormat("HH");
		SimpleDateFormat format3 = new SimpleDateFormat("mm");
		SimpleDateFormat format4 = new SimpleDateFormat("dd");
		Date time = new Date();
		String time1 = format1.format(time);// ��¥�� �б��� ������ (�����ֱ��)
		String time2 = format2.format(time);// ���� �������� �ŷ�����//��
		String time3 = format2.format(time);// ���� �������� �ŷ�����//��
		String time4 = format3.format(time);// �Ϸ縶�� ������ ����
		int hhtime = Integer.parseInt(time2);
		int mmtime = Integer.parseInt(time3);
		rand d = new rand();
		int[] PM = new int[10];
		d.randd(jusick);
		d.randomm();
		jusick = d.change(chang);
		setTitle("���ֽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel ���_2 = new JLabel("\uC815\uADDC\uAC70\uB798\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
		JLabel ���ֽ�_ȭ��ǥ1 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ1 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ1 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ1 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ1 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ2 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ2 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ2 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ2 = new JLabel("");
		JLabel ���ֽ�_ȭ��ǥ2 = new JLabel("");
		JTextArea ��¥_�ð� = new JTextArea();
		��¥_�ð�.setFont(new Font("�������", Font.PLAIN, 20));

		JTextArea ���ֽ�_��ȭ�� = new JTextArea();
		JTextArea ���ֽ�_��ȭ�� = new JTextArea();
		JTextArea ���ֽ�_��ȭ�� = new JTextArea();
		JTextArea ���ֽ�_��ȭ�� = new JTextArea();
		JTextArea ���ֽ�_��ȭ�� = new JTextArea();
		JPanel panel = new JPanel();
		JTextArea ���ֽ� = new JTextArea();
		JTextArea ���ֽ� = new JTextArea();
		JTextArea ���ֽ� = new JTextArea();
		JTextArea ���ֽ� = new JTextArea();
		JTextArea ���ֽ� = new JTextArea();
		JButton �ƴϿ� = new JButton("\uC544\uB2C8\uC694");
		JLabel ������� = new JLabel("\uB3C8\uC744 \uBE4C\uB9AC\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		JButton �� = new JButton("\uC608");
		��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				��.setVisible(false);
				�ƴϿ�.setVisible(false);
				�������.setVisible(false);
				debt = debt + jusick[num];
				ju[num]++;
			}
		});
		�ƴϿ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				��.setVisible(false);
				�ƴϿ�.setVisible(false);
				�������.setVisible(false);
			}
		});
		�������.setVisible(false);
		JTextArea �� = new JTextArea();
		JPanel panel_2 = new JPanel();
		JTextArea ���ֽ�_�� = new JTextArea();
		JTextArea ���ֽ�_�� = new JTextArea();
		JTextArea ���ֽ�_�� = new JTextArea();
		JTextArea ���ֽ�_�� = new JTextArea();
		JTextArea ���ֽ�_�� = new JTextArea();
		JTextArea ���ֽ�_�Ǹ� = new JTextArea();
		JTextArea ���ֽ�_�Ǹ� = new JTextArea();
		JTextArea ���ֽ�_�Ǹ� = new JTextArea();
		JTextArea ���ֽ�_�Ǹ� = new JTextArea();
		JTextArea ���ֽ�_�Ǹ� = new JTextArea();
		JTextArea ���絷 = new JTextArea();
		JTextArea ���_1 = new JTextArea();

		panel_2.setBounds(0, 0, 782, 553);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		JButton ���ư��� = new JButton("\uB3CC\uC544\uAC00\uAE30");
		���ư���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				d.randd(jusick);
				d.randomm();
				JPanel panel_1 = new JPanel();
				jusick = d.change(chang);
				if (chang[0] >= 0) {
					���ֽ�_ȭ��ǥ1.setVisible(true);
					���ֽ�_ȭ��ǥ2.setVisible(false);
				} else {
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(true);
				}
				if (chang[1] >= 0) {
					���ֽ�_ȭ��ǥ1.setVisible(true);
					���ֽ�_ȭ��ǥ2.setVisible(false);
				} else {
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(true);
				}
				if (chang[2] >= 0) {
					���ֽ�_ȭ��ǥ1.setVisible(true);
					���ֽ�_ȭ��ǥ2.setVisible(false);
				} else {
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(true);
				}
				if (chang[3] >= 0) {
					���ֽ�_ȭ��ǥ1.setVisible(true);
					���ֽ�_ȭ��ǥ2.setVisible(false);
				} else {
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(true);
				}
				if (chang[4] >= 0) {
					���ֽ�_ȭ��ǥ1.setVisible(true);
					���ֽ�_ȭ��ǥ2.setVisible(false);
				} else {
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(true);
				}
				if (money_sell[0] != 0 && money_sell[0] < jusick[0]) {
					int sum = ju[0];
					ju[0] = 0;
					mywallet = mywallet + (sum * jusick[0]);
					money_sell[0] = 0;
				}
				if (money_get[0] != 0 && money_get[0] > jusick[0]) {
					ju[0]++;
					mywallet = mywallet - jusick[0];
					money_get[0] = 0;
				}
				if (money_sell[1] != 0 && money_sell[1] < jusick[1]) {
					int sum = ju[1];
					ju[1] = 0;
					mywallet = mywallet + (sum * jusick[1]);
					money_sell[1] = 0;
				}
				if (money_get[1] != 0 && money_get[1] > jusick[1]) {
					ju[1]++;
					mywallet = mywallet - jusick[1];
					money_get[1] = 0;
				}
				if (money_sell[2] != 0 && money_sell[2] < jusick[2]) {
					int sum = ju[2];
					ju[2] = 0;
					mywallet = mywallet + (sum * jusick[2]);
					money_sell[2] = 0;
				}
				if (money_get[2] != 0 && money_get[2] > jusick[2]) {
					ju[2]++;
					mywallet = mywallet - jusick[2];
					money_get[2] = 0;
				}
				if (money_sell[3] != 0 && money_sell[3] < jusick[3]) {
					int sum = ju[3];
					ju[3] = 0;
					mywallet = mywallet + (sum * jusick[3]);
					money_sell[3] = 0;
				}
				if (money_get[3] != 0 && money_get[3] > jusick[3]) {
					ju[3]++;
					mywallet = mywallet - jusick[3];
					money_get[3] = 0;
				}
				if (money_sell[4] != 0 && money_sell[4] < jusick[4]) {
					int sum = ju[4];
					ju[4] = 0;
					mywallet = mywallet + (sum * jusick[4]);
					money_sell[4] = 0;
				}
				if (money_get[4] != 0 && money_get[4] > jusick[4]) {
					ju[4]++;
					mywallet = mywallet - jusick[4];
					money_get[4] = 0;
				}
				if (debt > 0) {
					switch (level) {
					case 1:
						debt = debt + (debt / 30);
						level--;
						break;
					case 2:
						debt = debt + (debt / 25);
						level--;
						break;
					case 3:
						debt = debt + (debt / 20);
						level--;
						break;
					case 4:
						debt = debt + (debt / 15);
						level--;
						break;
					case 5:
						debt = debt + (debt / 10);
						break;
					}
				} else {
					if (level < 5) {
						level++;
					}
				}
				���ֽ�_��ȭ��.setText("");
				���ֽ�_��ȭ��.setText("");
				���ֽ�_��ȭ��.setText("");
				���ֽ�_��ȭ��.setText("");
				���ֽ�_��ȭ��.setText("");
				���ֽ�_��ȭ��.append(" " + chang[0]);
				���ֽ�_��ȭ��.append(" " + chang[1]);
				���ֽ�_��ȭ��.append(" " + chang[2]);
				���ֽ�_��ȭ��.append(" " + chang[3]);
				���ֽ�_��ȭ��.append(" " + chang[4]);

				���ֽ�.setText("");
				���ֽ�.setText("");
				���ֽ�.setText("");
				���ֽ�.setText("");
				���ֽ�.setText("");
				���ֽ�.append(" " + jusick[0]);
				���ֽ�.append(" " + jusick[1]);
				���ֽ�.append(" " + jusick[2]);
				���ֽ�.append(" " + jusick[3]);
				���ֽ�.append(" " + jusick[4]);

				panel.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);

			}
		});
		���_1.setFont(new Font("�������", Font.PLAIN, 13));
		���_1.setText("\uC608\uD310\uC740 8:00~9:00\uC5D0\uB9CC \uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		���_1.setBounds(516, 90, 217, 24);
		panel_2.add(���_1);

		���ֽ�_��.setBounds(584, 408, 40, 24);
		panel_2.add(���ֽ�_��);

		���ֽ�_��.setBounds(584, 346, 40, 24);
		panel_2.add(���ֽ�_��);

		���ֽ�_��.setBounds(584, 281, 40, 24);
		panel_2.add(���ֽ�_��);

		���ֽ�_��.setBounds(584, 208, 40, 24);
		panel_2.add(���ֽ�_��);

		���ֽ�_��.setBounds(584, 139, 40, 24);
		panel_2.add(���ֽ�_��);

		���ֽ�_�Ǹ�.setBounds(464, 408, 96, 24);
		panel_2.add(���ֽ�_�Ǹ�);

		���ֽ�_�Ǹ�.setBounds(464, 346, 96, 24);
		panel_2.add(���ֽ�_�Ǹ�);

		���ֽ�_�Ǹ�.setBounds(464, 281, 96, 24);
		panel_2.add(���ֽ�_�Ǹ�);
		���ֽ�_�Ǹ�.setBounds(464, 208, 96, 24);
		panel_2.add(���ֽ�_�Ǹ�);

		���ֽ�_�Ǹ�.setBounds(464, 139, 96, 24);
		panel_2.add(���ֽ�_�Ǹ�);

		���絷.setBounds(143, 182, 96, 24);
		panel_2.add(���絷);
		��.setBounds(143, 272, 96, 24);
		panel_2.add(��);
		���ư���.setFont(new Font("�������", Font.PLAIN, 15));
		���ư���.setBackground(Color.WHITE);
		���ư���.setForeground(Color.PINK);
		���ư���.setBounds(616, 45, 105, 27);
		panel_2.add(���ư���);

		JButton ���ֽ�_���� = new JButton("");
		���ֽ�_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (9 <= hhtime && 16 >= hhtime) {
					if (ju[4] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("�ŵ� �ݾ��� �Է��Ͻÿ�");
						money_sell[4] = Integer.parseInt(money);
					}

				} else {
					���_1.setVisible(true);
				}
			}
		});
		���ֽ�_����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		���ֽ�_����.setBounds(523, 437, 66, 24);
		panel_2.add(���ֽ�_����);

		JButton ���ֽ�_�ǹ� = new JButton("");
		���ֽ�_�ǹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_1.setVisible(false);
				if (ju[4] > 0) {
					mywallet = mywallet + jusick[4];
					ju[4]--;
					���絷.setText("");
					���絷.append(" " + mywallet);
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.append(" " + ju[0]);
					���ֽ�_��.append(" " + ju[1]);
					���ֽ�_��.append(" " + ju[2]);
					���ֽ�_��.append(" " + ju[3]);
					���ֽ�_��.append(" " + ju[4]);
				}
			}
		});
		���ֽ�_�ǹ�.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		���ֽ�_�ǹ�.setBounds(467, 435, 40, 22);
		panel_2.add(���ֽ�_�ǹ�);

		JButton ���ֽ�_���� = new JButton("");
		���ֽ�_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[3] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("�ŵ� �ݾ��� �Է��Ͻÿ�");
						money_sell[3] = Integer.parseInt(money);
					}

				} else {
					���_1.setVisible(true);
				}
			}
		});
		���ֽ�_����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		���ֽ�_����.setBounds(521, 375, 68, 27);
		panel_2.add(���ֽ�_����);

		JButton ���ֽ�_�ǹ� = new JButton("");
		���ֽ�_�ǹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_1.setVisible(false);
				if (ju[3] > 0) {
					mywallet = mywallet + jusick[3];
					ju[3]--;
					���絷.setText("");
					���絷.append(" " + mywallet);
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.append(" " + ju[0]);
					���ֽ�_��.append(" " + ju[1]);
					���ֽ�_��.append(" " + ju[2]);
					���ֽ�_��.append(" " + ju[3]);
					���ֽ�_��.append(" " + ju[4]);
				}
			}
		});
		���ֽ�_�ǹ�.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		���ֽ�_�ǹ�.setBounds(466, 374, 41, 22);
		panel_2.add(���ֽ�_�ǹ�);

		JButton ���ֽ�_���� = new JButton("");
		���ֽ�_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[2] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("�ŵ� �ݾ��� �Է��Ͻÿ�");
						money_sell[2] = Integer.parseInt(money);
					}

				} else {
					���_1.setVisible(true);
				}
			}
		});
		���ֽ�_����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		���ֽ�_����.setBounds(523, 313, 66, 27);
		panel_2.add(���ֽ�_����);

		JButton ���ֽ�_�ǹ� = new JButton("");
		���ֽ�_�ǹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_1.setVisible(false);
				if (ju[2] > 0) {
					mywallet = mywallet + jusick[2];
					ju[2]--;
					���絷.setText("");
					���絷.append(" " + mywallet);
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.append(" " + ju[0]);
					���ֽ�_��.append(" " + ju[1]);
					���ֽ�_��.append(" " + ju[2]);
					���ֽ�_��.append(" " + ju[3]);
					���ֽ�_��.append(" " + ju[4]);
				}
			}
		});
		���ֽ�_�ǹ�.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		���ֽ�_�ǹ�.setBounds(467, 312, 44, 21);
		panel_2.add(���ֽ�_�ǹ�);

		JButton ���ֽ�_���� = new JButton("");
		���ֽ�_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[1] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("�ŵ� �ݾ��� �Է��Ͻÿ�");
						money_sell[1] = Integer.parseInt(money);
					}
				} else {
					���_1.setVisible(true);
				}
			}
		});
		���ֽ�_����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		���ֽ�_����.setBounds(523, 248, 66, 27);
		panel_2.add(���ֽ�_����);

		JButton ���ֽ�_�ǹ� = new JButton("");
		���ֽ�_�ǹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_1.setVisible(false);
				if (ju[1] > 0) {
					mywallet = mywallet + jusick[1];
					ju[1]--;
					���絷.setText("");
					���絷.append(" " + mywallet);
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.append(" " + ju[0]);
					���ֽ�_��.append(" " + ju[1]);
					���ֽ�_��.append(" " + ju[2]);
					���ֽ�_��.append(" " + ju[3]);
					���ֽ�_��.append(" " + ju[4]);
				}
			}
		});
		���ֽ�_�ǹ�.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		���ֽ�_�ǹ�.setBounds(468, 248, 41, 21);
		panel_2.add(���ֽ�_�ǹ�);

		JButton ���ֽ�_���� = new JButton("");
		���ֽ�_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[0] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("�ŵ� �ݾ��� �Է��Ͻÿ�");
						money_sell[0] = Integer.parseInt(money);
					}

				} else {
					���_1.setVisible(true);
				}
			}
		});
		���ֽ�_����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		���ֽ�_����.setBounds(523, 175, 66, 24);
		panel_2.add(���ֽ�_����);

		JButton ���ֽ�_�ǹ� = new JButton("");
		���ֽ�_�ǹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_1.setVisible(false);
				if (ju[0] > 0) {
					mywallet = mywallet + jusick[0];
					ju[0]--;
					���絷.setText("");
					���絷.append(" " + mywallet);
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.setText("");
					���ֽ�_��.append(" " + ju[0]);
					���ֽ�_��.append(" " + ju[1]);
					���ֽ�_��.append(" " + ju[2]);
					���ֽ�_��.append(" " + ju[3]);
					���ֽ�_��.append(" " + ju[4]);
				}
			}
		});
		���ֽ�_�ǹ�.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		���ֽ�_�ǹ�.setBounds(468, 175, 41, 21);
		panel_2.add(���ֽ�_�ǹ�);

		JButton ������ = new JButton("");
		������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���_1.setVisible(false);
				if (mywallet > 0) {
					if (mywallet - debt > 0) {
						mywallet = mywallet - debt;
						debt = 0;
						��.setText("");
						��.append(" " + debt);
						���絷.setText("");
						���絷.append(" " + mywallet);
					} else if (debt - mywallet > 0) {
						debt = debt - mywallet;
						mywallet = 0;
						��.setText("");
						��.append(" " + debt);
						���絷.setText("");
						���絷.append(" " + mywallet);
					}
				}
			}
		});
		������.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_6.jpg"));
		������.setBounds(181, 305, 58, 21);
		panel_2.add(������);

		JLabel ������_��� = new JLabel("");
		������_���.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uBC30\uACBD_3.jpg"));
		������_���.setBounds(0, 0, 782, 553);
		panel_2.add(������_���);
		panel_2.setVisible(false);

		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(0, 0, 782, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);

		JButton Exit = new JButton("exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BufferedOutputStream bs1 = null;
				BufferedOutputStream bs2 = null;
				BufferedOutputStream bs3 = null;
				BufferedOutputStream bs4 = null;
				BufferedOutputStream bs5 = null;
				BufferedOutputStream bs6 = null;
				BufferedOutputStream bs7 = null;
				String[] a = new String[10];
				try {
					bs1 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//���ֽ�_����.txt"));
					String str = Integer.toString(ju[0]);
					bs1.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs1.close();
					bs2 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//���ֽ�_����.txt"));
					str = Integer.toString(ju[1]);
					bs2.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs2.close();
					bs3 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//���ֽ�_����.txt"));
					str = Integer.toString(ju[2]);
					bs3.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs3.close();
					bs4 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//���ֽ�_����.txt"));
					str = Integer.toString(ju[3]);
					bs4.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs4.close();
					bs5 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//���ֽ�_����.txt"));
					str = Integer.toString(ju[4]);
					bs5.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs5.close();
					bs6 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//����_����.txt"));
					str = Integer.toString(mywallet);
					bs6.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs6.close();
					bs7 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//��_����.txt"));
					str = Integer.toString(debt);
					bs7.write(str.getBytes()); // Byte�����θ� ���� �� ����
					bs7.close();
				} catch (Exception e) {
					e.getStackTrace();
				}

				System.exit(0);
			}
		});
		Exit.setForeground(Color.WHITE);
		Exit.setBackground(Color.PINK);
		Exit.setFont(new Font("Mapo�ݺ�����", Font.PLAIN, 17));
		Exit.setBounds(663, 452, 105, 27);
		panel.add(Exit);

		���_3.setFont(new Font("�������", Font.PLAIN, 13));
		���_3.setText("\uC608\uC57D\uAD6C\uB9E4\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
		���_3.setBounds(413, 456, 168, 24);
		panel.add(���_3);

		���_2.setFont(new Font("�������", Font.PLAIN, 15));
		���_2.setBounds(154, 30, 168, 18);
		panel.add(���_2);

		��¥_�ð�.setBounds(560, 499, 194, 22);
		panel.add(��¥_�ð�);

		JLabel ��_�� = new JLabel("\uB0A0\uC9DC/\uC2DC\uAC04");
		��_��.setFont(new Font("�������", Font.PLAIN, 20));
		��_��.setBounds(476, 492, 91, 38);
		panel.add(��_��);

		���ֽ�_ȭ��ǥ1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		���ֽ�_ȭ��ǥ1.setHorizontalAlignment(SwingConstants.TRAILING);
		���ֽ�_ȭ��ǥ1.setBounds(287, 464, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ1);

		���ֽ�_ȭ��ǥ2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		���ֽ�_ȭ��ǥ2.setBounds(286, 465, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ2);

		���ֽ�_ȭ��ǥ1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		���ֽ�_ȭ��ǥ1.setBounds(285, 294, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ1);

		���ֽ�_ȭ��ǥ1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		���ֽ�_ȭ��ǥ1.setBounds(285, 380, 36, 22);
		panel.add(���ֽ�_ȭ��ǥ1);

		���ֽ�_ȭ��ǥ2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		���ֽ�_ȭ��ǥ2.setBounds(285, 294, 36, 22);
		panel.add(���ֽ�_ȭ��ǥ2);

		���ֽ�_ȭ��ǥ2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		���ֽ�_ȭ��ǥ2.setBounds(289, 384, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ2);

		���ֽ�_ȭ��ǥ1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		���ֽ�_ȭ��ǥ1.setBounds(288, 209, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ1);

		���ֽ�_ȭ��ǥ2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		���ֽ�_ȭ��ǥ2.setBounds(285, 129, 36, 22);
		panel.add(���ֽ�_ȭ��ǥ2);

		���ֽ�_ȭ��ǥ1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		���ֽ�_ȭ��ǥ1.setBounds(285, 129, 36, 24);
		panel.add(���ֽ�_ȭ��ǥ1);
		���ֽ�_ȭ��ǥ2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		���ֽ�_ȭ��ǥ2.setBounds(288, 214, 36, 22);
		panel.add(���ֽ�_ȭ��ǥ2);
		���ֽ�_��ȭ��.setBounds(249, 370, 53, 24);
		panel.add(���ֽ�_��ȭ��);
		���ֽ�_��ȭ��.setBounds(249, 208, 53, 24);
		panel.add(���ֽ�_��ȭ��);
		���ֽ�_��ȭ��.setBounds(249, 456, 53, 24);
		panel.add(���ֽ�_��ȭ��);
		���ֽ�_��ȭ��.setBounds(249, 286, 53, 24);
		panel.add(���ֽ�_��ȭ��);
		���ֽ�_��ȭ��.setBounds(249, 127, 53, 24);
		panel.add(���ֽ�_��ȭ��);
		�������.setFont(new Font("�������", Font.PLAIN, 17));
		�������.setBounds(439, 183, 175, 27);
		panel.add(�������);

		�ƴϿ�.setForeground(Color.WHITE);
		�ƴϿ�.setFont(new Font("�������", Font.PLAIN, 15));
		�ƴϿ�.setBackground(SystemColor.activeCaption);
		�ƴϿ�.setBounds(560, 263, 105, 27);
		panel.add(�ƴϿ�);

		��.setForeground(Color.WHITE);
		��.setFont(new Font("�������", Font.PLAIN, 15));
		��.setBackground(SystemColor.activeCaption);
		��.setBounds(413, 263, 105, 27);
		panel.add(��);

		���ֽ�.setBounds(154, 456, 75, 24);
		panel.add(���ֽ�);
		���ֽ�.append(" " + jusick[4]);
		���ֽ�.setBounds(154, 370, 75, 24);
		panel.add(���ֽ�);
		���ֽ�.append(" " + jusick[3]);
		���ֽ�.setBounds(154, 294, 75, 24);
		panel.add(���ֽ�);
		���ֽ�.append(" " + jusick[2]);
		���ֽ�.setBounds(154, 220, 75, 24);
		panel.add(���ֽ�);
		���ֽ�.append(" " + jusick[1]);
		���ֽ�.setBounds(154, 127, 75, 24);
		panel.add(���ֽ�);
		���ֽ�.append(" " + jusick[0]);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				���_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[0] >= 0) {
						mywallet = mywallet - jusick[0];
						ju[0]++;
					} else {
						num = 0;
						��.setVisible(true);
						�ƴϿ�.setVisible(true);
						�������.setVisible(true);
					}
				} else {
					���_2.setVisible(true);
				}
			}

		});
		btnNewButton_6.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_6.setBounds(154, 157, 53, 27);
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("�ż� �ݾ��� �Է��Ͻÿ�");
					money_get[0] = Integer.parseInt(money);
				} else {
					���_3.setVisible(true);
				}
				���_2.setVisible(false);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_7.setBounds(211, 157, 75, 27);
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[1] >= 0) {
						mywallet = mywallet - jusick[1];
						ju[1]++;
					} else {
						num = 1;
						��.setVisible(true);
						�ƴϿ�.setVisible(true);
						�������.setVisible(true);
					}
				} else {
					���_2.setVisible(true);
				}
			}
		});
		btnNewButton_8.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_8.setBounds(154, 244, 53, 27);
		panel.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("�ż� �ݾ��� �Է��Ͻÿ�");
					money_get[1] = Integer.parseInt(money);
				} else {
					���_3.setVisible(true);
				}
				���_2.setVisible(false);
			}
		});
		btnNewButton_9.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_9.setBounds(211, 244, 75, 27);
		panel.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("�ż� �ݾ��� �Է��Ͻÿ�");
					money_get[2] = Integer.parseInt(money);

				} else {
					���_3.setVisible(true);
				}
				���_2.setVisible(false);
			}
		});
		btnNewButton_10.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_10.setBounds(211, 322, 75, 27);
		panel.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[2] >= 0) {
						mywallet = mywallet - jusick[2];
						ju[2]++;
					} else {
						num = 2;
						��.setVisible(true);
						�ƴϿ�.setVisible(true);
						�������.setVisible(true);
					}
				} else {
					���_2.setVisible(true);
				}
			}

		});
		btnNewButton_11.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_11.setBounds(154, 322, 53, 27);
		panel.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[3] >= 0) {
						mywallet = mywallet - jusick[3];
						ju[3]++;
					} else {
						num = 3;
						��.setVisible(true);
						�ƴϿ�.setVisible(true);
						�������.setVisible(true);
					}
				} else {
					���_2.setVisible(true);
				}

			}
		});
		btnNewButton_12.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_12.setBounds(154, 406, 53, 27);
		panel.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("�ż� �ݾ��� �Է��Ͻÿ�");
					money_get[3] = Integer.parseInt(money);
				} else {
					���_3.setVisible(true);
				}
				���_2.setVisible(false);
			}
		});
		btnNewButton_13.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_13.setBounds(211, 406, 75, 27);
		panel.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[4] >= 0) {
						mywallet = mywallet - jusick[4];
						ju[4]++;
					} else {
						num = 4;
						��.setVisible(true);
						�ƴϿ�.setVisible(true);
						�������.setVisible(true);
					}
				} else {
					���_2.setVisible(true);
				}
			}
		});
		btnNewButton_14.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_14.setBounds(154, 492, 53, 27);
		panel.add(btnNewButton_14);
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 > hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("�ż� �ݾ��� �Է��Ͻÿ�");
					money_get[4] = Integer.parseInt(money);
				} else {
					���_3.setVisible(true);
				}
				���_2.setVisible(false);
			}
		});
		btnNewButton_15.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_15.setBounds(211, 492, 75, 27);
		panel.add(btnNewButton_15);
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				���_1.setVisible(false);
				���_2.setVisible(false);
				��.setText("");
				��.append(" " + debt);
				���絷.setText("");
				���絷.append(" " + mywallet);
				���ֽ�_�Ǹ�.setText("");
				���ֽ�_�Ǹ�.setText("");
				���ֽ�_�Ǹ�.setText("");
				���ֽ�_�Ǹ�.setText("");
				���ֽ�_�Ǹ�.setText("");
				���ֽ�_�Ǹ�.append(" " + jusick[0]);
				���ֽ�_�Ǹ�.append(" " + jusick[1]);
				���ֽ�_�Ǹ�.append(" " + jusick[2]);
				���ֽ�_�Ǹ�.append(" " + jusick[3]);
				���ֽ�_�Ǹ�.append(" " + jusick[4]);
				���ֽ�_��.setText("");
				���ֽ�_��.setText("");
				���ֽ�_��.setText("");
				���ֽ�_��.setText("");
				���ֽ�_��.setText("");
				���ֽ�_��.append(" " + ju[0]);
				���ֽ�_��.append(" " + ju[1]);
				���ֽ�_��.append(" " + ju[2]);
				���ֽ�_��.append(" " + ju[3]);
				���ֽ�_��.append(" " + ju[4]);
				��¥_�ð�.setText("");
				��¥_�ð�.append(time1);
				panel_1_1.setVisible(false);
				panel.setVisible(false);
				panel_2.setVisible(true);

			}
		});
		btnNewButton_16.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_5.jpg"));
		btnNewButton_16.setBounds(636, 49, 62, 27);
		panel.add(btnNewButton_16);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uBC30\uACBD_2.jpg"));
		lblNewLabel_5.setBounds(0, 0, 782, 553);
		panel.add(lblNewLabel_5);

		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(0, 0, 782, 553);
		contentPane.add(panel_1_1);
		JButton ���� = new JButton("");

		JLabel lblNewLabel_7 = new JLabel("");
		����.setBounds(305, 301, 152, 45);
		����.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_1.jpg"));
		����.setToolTipText("");
		����.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				���_3.setVisible(false);
				if (8 <= hhtime && 24 >= (int) hhtime) {// ������ 8~16
					���_2.setVisible(false);
					��¥_�ð�.setText("");
					��¥_�ð�.append(time1);
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ1.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(false);
					���ֽ�_ȭ��ǥ2.setVisible(false);
					�ƴϿ�.setVisible(false);
					��.setVisible(false);
					panel_1_1.setVisible(false);
					panel_2.setVisible(false);
					panel.setVisible(true);
				}
			}
		});
		panel_1_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC548\uB0B4\uD310.jpg"));
		lblNewLabel.setBounds(14, 25, 225, 101);
		panel_1_1.add(lblNewLabel);
		panel_1_1.add(����);

		lblNewLabel_7.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uBC30\uACBD_1.jpg"));
		lblNewLabel_7.setBounds(0, 0, 782, 553);
		panel_1_1.add(lblNewLabel_7);
	}
}

class rand {
	int[] PM = new int[10];// -,+�� �������� �ҷ���
	int[] jusick = { 100, 200, 300, 400, 500 };

	void randd(int[] jusick) {
		this.jusick = jusick;
	}

	void randomm() {
		for (int i = 0; i < 5; i++) {
			PM[i] = (int) (Math.random() * this.jusick[i] * 10);
			if (PM[i] % 2 == 0) {
				PM[i] = 1;
			} else {
				PM[i] = -1;
			}
		}
	}

	int[] change(int[] chang) {// �� ��ȯ
		for (int i = 0; i < 5; i++) {
			chang[i] = PM[i] * (int) (Math.random() * (this.jusick[i] * 0.2));
			this.jusick[i] = this.jusick[i] + chang[i];// �ִ� 20%�� ��ȭ�� ����(������ ��ȭ��)
		}
		return this.jusick;
	}
}
