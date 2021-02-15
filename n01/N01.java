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

	JTextArea 경고_3 = new JTextArea();
	JLabel 경고 = new JLabel("\uC815\uADDC\uAC70\uB798\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
	int[] money_sell = new int[5];// 예약 판매가
	int[] money_get = new int[5];// 예약 구매가
	int[] chang = new int[5];// 변화값
	int num;// 구매 주식 인덱스 값
	int debt = 0;// 빚
	// 몇번 턴을 넘겼는가에 따라 신용도가 달라짐
	int click = 0;
	int level = 5;// 신용도
	int mywallet = 100000;// 내 지갑
	int[] suick = new int[5];// 배당금
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

		String filePath1 = "D://java_workspace//Project//src//n01//일주식_복사.txt"; // 대상 파일
		String filePath2 = "D://java_workspace//Project//src//n01//이주식_복사.txt"; // 대상 파일
		String filePath3 = "D://java_workspace//Project//src//n01//삼주식_복사.txt"; // 대상 파일
		String filePath4 = "D://java_workspace//Project//src//n01//사주식_복사.txt"; // 대상 파일
		String filePath5 = "D://java_workspace//Project//src//n01//오주식_복사.txt"; // 대상 파일
		String filePath6 = "D://java_workspace//Project//src//n01//내돈_복사.txt"; // 대상 파일
		String filePath7 = "D://java_workspace//Project//src//n01//빚_복사.txt"; // 대상 파일
		FileInputStream fileStream1 = null; // 파일 스트림
		FileInputStream fileStream2 = null; // 파일 스트림
		FileInputStream fileStream3 = null; // 파일 스트림
		FileInputStream fileStream4 = null; // 파일 스트림
		FileInputStream fileStream5 = null; // 파일 스트림
		FileInputStream fileStream6 = null; // 파일 스트림
		FileInputStream fileStream7 = null; // 파일 스트림
		String[] a_1 = { "0" };
		String[] a_2 = { "0" };
		String[] a_3 = { "0" };
		String[] a_4 = { "0" };
		String[] a_5 = { "0" };
		String[] a_6 = { "0" };
		String[] a_7 = { "0" };
		int i = 0;
		try {
			// 바이트 단위로 파일읽기
			fileStream1 = new FileInputStream(filePath1);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer = new byte[fileStream1.available()];
			while (fileStream1.read(readBuffer) != -1) {
			}
			a_1[i] = new String(readBuffer); // 출력
			fileStream1.close(); // 스트림 닫기
			fileStream2 = new FileInputStream(filePath2);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer2 = new byte[fileStream2.available()];
			while (fileStream2.read(readBuffer2) != -1) {
			}
			a_2[i] = new String(readBuffer2); // 출력
			fileStream2.close(); // 스트림 닫기
			fileStream3 = new FileInputStream(filePath3);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer3 = new byte[fileStream3.available()];
			while (fileStream3.read(readBuffer3) != -1) {
			}
			a_3[i] = new String(readBuffer3); // 출력
			fileStream3.close(); // 스트림 닫기
			fileStream4 = new FileInputStream(filePath4);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer4 = new byte[fileStream4.available()];
			while (fileStream4.read(readBuffer4) != -1) {
			}
			a_4[i] = new String(readBuffer4); // 출력
			fileStream4.close(); // 스트림 닫기
			fileStream5 = new FileInputStream(filePath5);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer5 = new byte[fileStream5.available()];
			while (fileStream5.read(readBuffer5) != -1) {
			}
			a_5[i] = new String(readBuffer5); // 출력
			fileStream5.close(); // 스트림 닫기
			fileStream6 = new FileInputStream(filePath6);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer6 = new byte[fileStream6.available()];
			while (fileStream6.read(readBuffer6) != -1) {
			}
			a_6[i] = new String(readBuffer6); // 출력
			fileStream6.close(); // 스트림 닫기
			fileStream7 = new FileInputStream(filePath7);
			byte[] readBuffer7 = new byte[fileStream7.available()];
			while (fileStream7.read(readBuffer7) != -1) {
			}
			a_7[i] = new String(readBuffer7); // 출력
			fileStream7.close(); // 스트림 닫기

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
		String time1 = format1.format(time);// 날짜와 분까지 보여줌 (보여주기용)
		String time2 = format2.format(time);// 장이 열릴때만 거래가능//시
		String time3 = format2.format(time);// 장이 열릴때만 거래가능//분
		String time4 = format3.format(time);// 하루마다 배당금을 받음
		int hhtime = Integer.parseInt(time2);
		int mmtime = Integer.parseInt(time3);
		rand d = new rand();
		int[] PM = new int[10];
		d.randd(jusick);
		d.randomm();
		jusick = d.change(chang);
		setTitle("밍주식");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel 경고_2 = new JLabel("\uC815\uADDC\uAC70\uB798\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
		JLabel 일주식_화살표1 = new JLabel("");
		JLabel 이주식_화살표1 = new JLabel("");
		JLabel 삼주식_화살표1 = new JLabel("");
		JLabel 사주식_화살표1 = new JLabel("");
		JLabel 오주식_화살표1 = new JLabel("");
		JLabel 일주식_화살표2 = new JLabel("");
		JLabel 이주식_화살표2 = new JLabel("");
		JLabel 삼주식_화살표2 = new JLabel("");
		JLabel 사주식_화살표2 = new JLabel("");
		JLabel 오주식_화살표2 = new JLabel("");
		JTextArea 날짜_시간 = new JTextArea();
		날짜_시간.setFont(new Font("나눔고딕", Font.PLAIN, 20));

		JTextArea 일주식_변화값 = new JTextArea();
		JTextArea 이주식_변화값 = new JTextArea();
		JTextArea 삼주식_변화값 = new JTextArea();
		JTextArea 사주식_변화값 = new JTextArea();
		JTextArea 오주식_변화값 = new JTextArea();
		JPanel panel = new JPanel();
		JTextArea 일주식 = new JTextArea();
		JTextArea 이주식 = new JTextArea();
		JTextArea 삼주식 = new JTextArea();
		JTextArea 사주식 = new JTextArea();
		JTextArea 오주식 = new JTextArea();
		JButton 아니요 = new JButton("\uC544\uB2C8\uC694");
		JLabel 대출권유 = new JLabel("\uB3C8\uC744 \uBE4C\uB9AC\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		JButton 예 = new JButton("\uC608");
		예.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				예.setVisible(false);
				아니요.setVisible(false);
				대출권유.setVisible(false);
				debt = debt + jusick[num];
				ju[num]++;
			}
		});
		아니요.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				예.setVisible(false);
				아니요.setVisible(false);
				대출권유.setVisible(false);
			}
		});
		대출권유.setVisible(false);
		JTextArea 빚 = new JTextArea();
		JPanel panel_2 = new JPanel();
		JTextArea 일주식_주 = new JTextArea();
		JTextArea 이주식_주 = new JTextArea();
		JTextArea 삼주식_주 = new JTextArea();
		JTextArea 사주식_주 = new JTextArea();
		JTextArea 오주식_주 = new JTextArea();
		JTextArea 일주식_판매 = new JTextArea();
		JTextArea 이주식_판매 = new JTextArea();
		JTextArea 삼주식_판매 = new JTextArea();
		JTextArea 사주식_판매 = new JTextArea();
		JTextArea 오주식_판매 = new JTextArea();
		JTextArea 현재돈 = new JTextArea();
		JTextArea 경고_1 = new JTextArea();

		panel_2.setBounds(0, 0, 782, 553);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		JButton 돌아가기 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		돌아가기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				d.randd(jusick);
				d.randomm();
				JPanel panel_1 = new JPanel();
				jusick = d.change(chang);
				if (chang[0] >= 0) {
					일주식_화살표1.setVisible(true);
					일주식_화살표2.setVisible(false);
				} else {
					일주식_화살표1.setVisible(false);
					일주식_화살표2.setVisible(true);
				}
				if (chang[1] >= 0) {
					이주식_화살표1.setVisible(true);
					이주식_화살표2.setVisible(false);
				} else {
					이주식_화살표1.setVisible(false);
					이주식_화살표2.setVisible(true);
				}
				if (chang[2] >= 0) {
					삼주식_화살표1.setVisible(true);
					삼주식_화살표2.setVisible(false);
				} else {
					삼주식_화살표1.setVisible(false);
					삼주식_화살표2.setVisible(true);
				}
				if (chang[3] >= 0) {
					사주식_화살표1.setVisible(true);
					사주식_화살표2.setVisible(false);
				} else {
					사주식_화살표1.setVisible(false);
					사주식_화살표2.setVisible(true);
				}
				if (chang[4] >= 0) {
					오주식_화살표1.setVisible(true);
					오주식_화살표2.setVisible(false);
				} else {
					오주식_화살표1.setVisible(false);
					오주식_화살표2.setVisible(true);
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
				일주식_변화값.setText("");
				이주식_변화값.setText("");
				삼주식_변화값.setText("");
				사주식_변화값.setText("");
				오주식_변화값.setText("");
				일주식_변화값.append(" " + chang[0]);
				이주식_변화값.append(" " + chang[1]);
				삼주식_변화값.append(" " + chang[2]);
				사주식_변화값.append(" " + chang[3]);
				오주식_변화값.append(" " + chang[4]);

				일주식.setText("");
				이주식.setText("");
				삼주식.setText("");
				사주식.setText("");
				오주식.setText("");
				일주식.append(" " + jusick[0]);
				이주식.append(" " + jusick[1]);
				삼주식.append(" " + jusick[2]);
				사주식.append(" " + jusick[3]);
				오주식.append(" " + jusick[4]);

				panel.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);

			}
		});
		경고_1.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		경고_1.setText("\uC608\uD310\uC740 8:00~9:00\uC5D0\uB9CC \uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		경고_1.setBounds(516, 90, 217, 24);
		panel_2.add(경고_1);

		오주식_주.setBounds(584, 408, 40, 24);
		panel_2.add(오주식_주);

		사주식_주.setBounds(584, 346, 40, 24);
		panel_2.add(사주식_주);

		삼주식_주.setBounds(584, 281, 40, 24);
		panel_2.add(삼주식_주);

		이주식_주.setBounds(584, 208, 40, 24);
		panel_2.add(이주식_주);

		일주식_주.setBounds(584, 139, 40, 24);
		panel_2.add(일주식_주);

		오주식_판매.setBounds(464, 408, 96, 24);
		panel_2.add(오주식_판매);

		사주식_판매.setBounds(464, 346, 96, 24);
		panel_2.add(사주식_판매);

		삼주식_판매.setBounds(464, 281, 96, 24);
		panel_2.add(삼주식_판매);
		이주식_판매.setBounds(464, 208, 96, 24);
		panel_2.add(이주식_판매);

		일주식_판매.setBounds(464, 139, 96, 24);
		panel_2.add(일주식_판매);

		현재돈.setBounds(143, 182, 96, 24);
		panel_2.add(현재돈);
		빚.setBounds(143, 272, 96, 24);
		panel_2.add(빚);
		돌아가기.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		돌아가기.setBackground(Color.WHITE);
		돌아가기.setForeground(Color.PINK);
		돌아가기.setBounds(616, 45, 105, 27);
		panel_2.add(돌아가기);

		JButton 오주식_예판 = new JButton("");
		오주식_예판.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (9 <= hhtime && 16 >= hhtime) {
					if (ju[4] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("매도 금액을 입력하시오");
						money_sell[4] = Integer.parseInt(money);
					}

				} else {
					경고_1.setVisible(true);
				}
			}
		});
		오주식_예판.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		오주식_예판.setBounds(523, 437, 66, 24);
		panel_2.add(오주식_예판);

		JButton 오주식_판버 = new JButton("");
		오주식_판버.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_1.setVisible(false);
				if (ju[4] > 0) {
					mywallet = mywallet + jusick[4];
					ju[4]--;
					현재돈.setText("");
					현재돈.append(" " + mywallet);
					일주식_주.setText("");
					이주식_주.setText("");
					삼주식_주.setText("");
					사주식_주.setText("");
					오주식_주.setText("");
					일주식_주.append(" " + ju[0]);
					이주식_주.append(" " + ju[1]);
					삼주식_주.append(" " + ju[2]);
					사주식_주.append(" " + ju[3]);
					오주식_주.append(" " + ju[4]);
				}
			}
		});
		오주식_판버.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		오주식_판버.setBounds(467, 435, 40, 22);
		panel_2.add(오주식_판버);

		JButton 사주식_예판 = new JButton("");
		사주식_예판.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[3] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("매도 금액을 입력하시오");
						money_sell[3] = Integer.parseInt(money);
					}

				} else {
					경고_1.setVisible(true);
				}
			}
		});
		사주식_예판.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		사주식_예판.setBounds(521, 375, 68, 27);
		panel_2.add(사주식_예판);

		JButton 사주식_판버 = new JButton("");
		사주식_판버.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_1.setVisible(false);
				if (ju[3] > 0) {
					mywallet = mywallet + jusick[3];
					ju[3]--;
					현재돈.setText("");
					현재돈.append(" " + mywallet);
					일주식_주.setText("");
					이주식_주.setText("");
					삼주식_주.setText("");
					사주식_주.setText("");
					오주식_주.setText("");
					일주식_주.append(" " + ju[0]);
					이주식_주.append(" " + ju[1]);
					삼주식_주.append(" " + ju[2]);
					사주식_주.append(" " + ju[3]);
					오주식_주.append(" " + ju[4]);
				}
			}
		});
		사주식_판버.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		사주식_판버.setBounds(466, 374, 41, 22);
		panel_2.add(사주식_판버);

		JButton 삼주식_예판 = new JButton("");
		삼주식_예판.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[2] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("매도 금액을 입력하시오");
						money_sell[2] = Integer.parseInt(money);
					}

				} else {
					경고_1.setVisible(true);
				}
			}
		});
		삼주식_예판.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		삼주식_예판.setBounds(523, 313, 66, 27);
		panel_2.add(삼주식_예판);

		JButton 삼주식_판버 = new JButton("");
		삼주식_판버.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_1.setVisible(false);
				if (ju[2] > 0) {
					mywallet = mywallet + jusick[2];
					ju[2]--;
					현재돈.setText("");
					현재돈.append(" " + mywallet);
					일주식_주.setText("");
					이주식_주.setText("");
					삼주식_주.setText("");
					사주식_주.setText("");
					오주식_주.setText("");
					일주식_주.append(" " + ju[0]);
					이주식_주.append(" " + ju[1]);
					삼주식_주.append(" " + ju[2]);
					사주식_주.append(" " + ju[3]);
					오주식_주.append(" " + ju[4]);
				}
			}
		});
		삼주식_판버.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		삼주식_판버.setBounds(467, 312, 44, 21);
		panel_2.add(삼주식_판버);

		JButton 이주식_예판 = new JButton("");
		이주식_예판.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[1] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("매도 금액을 입력하시오");
						money_sell[1] = Integer.parseInt(money);
					}
				} else {
					경고_1.setVisible(true);
				}
			}
		});
		이주식_예판.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		이주식_예판.setBounds(523, 248, 66, 27);
		panel_2.add(이주식_예판);

		JButton 이주식_판버 = new JButton("");
		이주식_판버.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_1.setVisible(false);
				if (ju[1] > 0) {
					mywallet = mywallet + jusick[1];
					ju[1]--;
					현재돈.setText("");
					현재돈.append(" " + mywallet);
					일주식_주.setText("");
					이주식_주.setText("");
					삼주식_주.setText("");
					사주식_주.setText("");
					오주식_주.setText("");
					일주식_주.append(" " + ju[0]);
					이주식_주.append(" " + ju[1]);
					삼주식_주.append(" " + ju[2]);
					사주식_주.append(" " + ju[3]);
					오주식_주.append(" " + ju[4]);
				}
			}
		});
		이주식_판버.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		이주식_판버.setBounds(468, 248, 41, 21);
		panel_2.add(이주식_판버);

		JButton 일주식_예판 = new JButton("");
		일주식_예판.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					if (ju[0] > 0) {
						String money = javax.swing.JOptionPane.showInputDialog("매도 금액을 입력하시오");
						money_sell[0] = Integer.parseInt(money);
					}

				} else {
					경고_1.setVisible(true);
				}
			}
		});
		일주식_예판.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_7.jpg"));
		일주식_예판.setBounds(523, 175, 66, 24);
		panel_2.add(일주식_예판);

		JButton 일주식_판버 = new JButton("");
		일주식_판버.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_1.setVisible(false);
				if (ju[0] > 0) {
					mywallet = mywallet + jusick[0];
					ju[0]--;
					현재돈.setText("");
					현재돈.append(" " + mywallet);
					일주식_주.setText("");
					이주식_주.setText("");
					삼주식_주.setText("");
					사주식_주.setText("");
					오주식_주.setText("");
					일주식_주.append(" " + ju[0]);
					이주식_주.append(" " + ju[1]);
					삼주식_주.append(" " + ju[2]);
					사주식_주.append(" " + ju[3]);
					오주식_주.append(" " + ju[4]);
				}
			}
		});
		일주식_판버.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_8.jpg"));
		일주식_판버.setBounds(468, 175, 41, 21);
		panel_2.add(일주식_판버);

		JButton 돈갚기 = new JButton("");
		돈갚기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				경고_1.setVisible(false);
				if (mywallet > 0) {
					if (mywallet - debt > 0) {
						mywallet = mywallet - debt;
						debt = 0;
						빚.setText("");
						빚.append(" " + debt);
						현재돈.setText("");
						현재돈.append(" " + mywallet);
					} else if (debt - mywallet > 0) {
						debt = debt - mywallet;
						mywallet = 0;
						빚.setText("");
						빚.append(" " + debt);
						현재돈.setText("");
						현재돈.append(" " + mywallet);
					}
				}
			}
		});
		돈갚기.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_6.jpg"));
		돈갚기.setBounds(181, 305, 58, 21);
		panel_2.add(돈갚기);

		JLabel 내정보_배경 = new JLabel("");
		내정보_배경.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uBC30\uACBD_3.jpg"));
		내정보_배경.setBounds(0, 0, 782, 553);
		panel_2.add(내정보_배경);
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
							new FileOutputStream("D://java_workspace//Project//src//n01//일주식_복사.txt"));
					String str = Integer.toString(ju[0]);
					bs1.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs1.close();
					bs2 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//이주식_복사.txt"));
					str = Integer.toString(ju[1]);
					bs2.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs2.close();
					bs3 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//삼주식_복사.txt"));
					str = Integer.toString(ju[2]);
					bs3.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs3.close();
					bs4 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//사주식_복사.txt"));
					str = Integer.toString(ju[3]);
					bs4.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs4.close();
					bs5 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//오주식_복사.txt"));
					str = Integer.toString(ju[4]);
					bs5.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs5.close();
					bs6 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//내돈_복사.txt"));
					str = Integer.toString(mywallet);
					bs6.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs6.close();
					bs7 = new BufferedOutputStream(
							new FileOutputStream("D://java_workspace//Project//src//n01//빚_복사.txt"));
					str = Integer.toString(debt);
					bs7.write(str.getBytes()); // Byte형으로만 넣을 수 있음
					bs7.close();
				} catch (Exception e) {
					e.getStackTrace();
				}

				System.exit(0);
			}
		});
		Exit.setForeground(Color.WHITE);
		Exit.setBackground(Color.PINK);
		Exit.setFont(new Font("Mapo금빛나루", Font.PLAIN, 17));
		Exit.setBounds(663, 452, 105, 27);
		panel.add(Exit);

		경고_3.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		경고_3.setText("\uC608\uC57D\uAD6C\uB9E4\uC2DC\uAC04\uC774 \uC544\uB2D9\uB2C8\uB2E4");
		경고_3.setBounds(413, 456, 168, 24);
		panel.add(경고_3);

		경고_2.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		경고_2.setBounds(154, 30, 168, 18);
		panel.add(경고_2);

		날짜_시간.setBounds(560, 499, 194, 22);
		panel.add(날짜_시간);

		JLabel 날_시 = new JLabel("\uB0A0\uC9DC/\uC2DC\uAC04");
		날_시.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		날_시.setBounds(476, 492, 91, 38);
		panel.add(날_시);

		오주식_화살표1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		오주식_화살표1.setHorizontalAlignment(SwingConstants.TRAILING);
		오주식_화살표1.setBounds(287, 464, 36, 24);
		panel.add(오주식_화살표1);

		오주식_화살표2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		오주식_화살표2.setBounds(286, 465, 36, 24);
		panel.add(오주식_화살표2);

		삼주식_화살표1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		삼주식_화살표1.setBounds(285, 294, 36, 24);
		panel.add(삼주식_화살표1);

		사주식_화살표1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		사주식_화살표1.setBounds(285, 380, 36, 22);
		panel.add(사주식_화살표1);

		삼주식_화살표2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		삼주식_화살표2.setBounds(285, 294, 36, 22);
		panel.add(삼주식_화살표2);

		사주식_화살표2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		사주식_화살표2.setBounds(289, 384, 36, 24);
		panel.add(사주식_화살표2);

		이주식_화살표1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		이주식_화살표1.setBounds(288, 209, 36, 24);
		panel.add(이주식_화살표1);

		일주식_화살표2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		일주식_화살표2.setBounds(285, 129, 36, 22);
		panel.add(일주식_화살표2);

		일주식_화살표1.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C1.jpg"));
		일주식_화살표1.setBounds(285, 129, 36, 24);
		panel.add(일주식_화살표1);
		이주식_화살표2.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uD654\uC0B4\uD45C2.jpg"));
		이주식_화살표2.setBounds(288, 214, 36, 22);
		panel.add(이주식_화살표2);
		사주식_변화값.setBounds(249, 370, 53, 24);
		panel.add(사주식_변화값);
		이주식_변화값.setBounds(249, 208, 53, 24);
		panel.add(이주식_변화값);
		오주식_변화값.setBounds(249, 456, 53, 24);
		panel.add(오주식_변화값);
		삼주식_변화값.setBounds(249, 286, 53, 24);
		panel.add(삼주식_변화값);
		일주식_변화값.setBounds(249, 127, 53, 24);
		panel.add(일주식_변화값);
		대출권유.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		대출권유.setBounds(439, 183, 175, 27);
		panel.add(대출권유);

		아니요.setForeground(Color.WHITE);
		아니요.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		아니요.setBackground(SystemColor.activeCaption);
		아니요.setBounds(560, 263, 105, 27);
		panel.add(아니요);

		예.setForeground(Color.WHITE);
		예.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		예.setBackground(SystemColor.activeCaption);
		예.setBounds(413, 263, 105, 27);
		panel.add(예);

		오주식.setBounds(154, 456, 75, 24);
		panel.add(오주식);
		오주식.append(" " + jusick[4]);
		사주식.setBounds(154, 370, 75, 24);
		panel.add(사주식);
		사주식.append(" " + jusick[3]);
		삼주식.setBounds(154, 294, 75, 24);
		panel.add(삼주식);
		삼주식.append(" " + jusick[2]);
		이주식.setBounds(154, 220, 75, 24);
		panel.add(이주식);
		이주식.append(" " + jusick[1]);
		일주식.setBounds(154, 127, 75, 24);
		panel.add(일주식);
		일주식.append(" " + jusick[0]);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				경고_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[0] >= 0) {
						mywallet = mywallet - jusick[0];
						ju[0]++;
					} else {
						num = 0;
						예.setVisible(true);
						아니요.setVisible(true);
						대출권유.setVisible(true);
					}
				} else {
					경고_2.setVisible(true);
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
					String money = javax.swing.JOptionPane.showInputDialog("매수 금액을 입력하시오");
					money_get[0] = Integer.parseInt(money);
				} else {
					경고_3.setVisible(true);
				}
				경고_2.setVisible(false);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_7.setBounds(211, 157, 75, 27);
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				경고_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[1] >= 0) {
						mywallet = mywallet - jusick[1];
						ju[1]++;
					} else {
						num = 1;
						예.setVisible(true);
						아니요.setVisible(true);
						대출권유.setVisible(true);
					}
				} else {
					경고_2.setVisible(true);
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
					String money = javax.swing.JOptionPane.showInputDialog("매수 금액을 입력하시오");
					money_get[1] = Integer.parseInt(money);
				} else {
					경고_3.setVisible(true);
				}
				경고_2.setVisible(false);
			}
		});
		btnNewButton_9.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_9.setBounds(211, 244, 75, 27);
		panel.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (8 <= hhtime && 9 >= hhtime) {
					String money = javax.swing.JOptionPane.showInputDialog("매수 금액을 입력하시오");
					money_get[2] = Integer.parseInt(money);

				} else {
					경고_3.setVisible(true);
				}
				경고_2.setVisible(false);
			}
		});
		btnNewButton_10.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_10.setBounds(211, 322, 75, 27);
		panel.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				경고_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[2] >= 0) {
						mywallet = mywallet - jusick[2];
						ju[2]++;
					} else {
						num = 2;
						예.setVisible(true);
						아니요.setVisible(true);
						대출권유.setVisible(true);
					}
				} else {
					경고_2.setVisible(true);
				}
			}

		});
		btnNewButton_11.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_4.jpg"));
		btnNewButton_11.setBounds(154, 322, 53, 27);
		panel.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				경고_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[3] >= 0) {
						mywallet = mywallet - jusick[3];
						ju[3]++;
					} else {
						num = 3;
						예.setVisible(true);
						아니요.setVisible(true);
						대출권유.setVisible(true);
					}
				} else {
					경고_2.setVisible(true);
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
					String money = javax.swing.JOptionPane.showInputDialog("매수 금액을 입력하시오");
					money_get[3] = Integer.parseInt(money);
				} else {
					경고_3.setVisible(true);
				}
				경고_2.setVisible(false);
			}
		});
		btnNewButton_13.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_13.setBounds(211, 406, 75, 27);
		panel.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				경고_3.setVisible(false);
				if (9 <= hhtime && hhtime <= 15) {
					if (mywallet - jusick[4] >= 0) {
						mywallet = mywallet - jusick[4];
						ju[4]++;
					} else {
						num = 4;
						예.setVisible(true);
						아니요.setVisible(true);
						대출권유.setVisible(true);
					}
				} else {
					경고_2.setVisible(true);
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
					String money = javax.swing.JOptionPane.showInputDialog("매수 금액을 입력하시오");
					money_get[4] = Integer.parseInt(money);
				} else {
					경고_3.setVisible(true);
				}
				경고_2.setVisible(false);
			}
		});
		btnNewButton_15.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_3.jpg"));
		btnNewButton_15.setBounds(211, 492, 75, 27);
		panel.add(btnNewButton_15);
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				경고_1.setVisible(false);
				경고_2.setVisible(false);
				빚.setText("");
				빚.append(" " + debt);
				현재돈.setText("");
				현재돈.append(" " + mywallet);
				일주식_판매.setText("");
				이주식_판매.setText("");
				삼주식_판매.setText("");
				사주식_판매.setText("");
				오주식_판매.setText("");
				일주식_판매.append(" " + jusick[0]);
				이주식_판매.append(" " + jusick[1]);
				삼주식_판매.append(" " + jusick[2]);
				사주식_판매.append(" " + jusick[3]);
				오주식_판매.append(" " + jusick[4]);
				일주식_주.setText("");
				이주식_주.setText("");
				삼주식_주.setText("");
				사주식_주.setText("");
				오주식_주.setText("");
				일주식_주.append(" " + ju[0]);
				이주식_주.append(" " + ju[1]);
				삼주식_주.append(" " + ju[2]);
				사주식_주.append(" " + ju[3]);
				오주식_주.append(" " + ju[4]);
				날짜_시간.setText("");
				날짜_시간.append(time1);
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
		JButton 시작 = new JButton("");

		JLabel lblNewLabel_7 = new JLabel("");
		시작.setBounds(305, 301, 152, 45);
		시작.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uC790\uBC14_1.jpg"));
		시작.setToolTipText("");
		시작.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		시작.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				경고_3.setVisible(false);
				if (8 <= hhtime && 24 >= (int) hhtime) {// 제작후 8~16
					경고_2.setVisible(false);
					날짜_시간.setText("");
					날짜_시간.append(time1);
					일주식_화살표1.setVisible(false);
					이주식_화살표1.setVisible(false);
					삼주식_화살표1.setVisible(false);
					사주식_화살표1.setVisible(false);
					오주식_화살표1.setVisible(false);
					일주식_화살표2.setVisible(false);
					이주식_화살표2.setVisible(false);
					삼주식_화살표2.setVisible(false);
					사주식_화살표2.setVisible(false);
					오주식_화살표2.setVisible(false);
					아니요.setVisible(false);
					예.setVisible(false);
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
		panel_1_1.add(시작);

		lblNewLabel_7.setIcon(new ImageIcon("D:\\\uD574\uC624\uB77C\uAE30\\\uBC30\uACBD_1.jpg"));
		lblNewLabel_7.setBounds(0, 0, 782, 553);
		panel_1_1.add(lblNewLabel_7);
	}
}

class rand {
	int[] PM = new int[10];// -,+를 랜덤으로 불러옴
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

	int[] change(int[] chang) {// 값 변환
		for (int i = 0; i < 5; i++) {
			chang[i] = PM[i] * (int) (Math.random() * (this.jusick[i] * 0.2));
			this.jusick[i] = this.jusick[i] + chang[i];// 최대 20%의 변화만 가능(서서히 변화함)
		}
		return this.jusick;
	}
}
