package org.module.client.presentation.orderui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXDatePicker;
import org.module.client.businesslogic.orderbl.SendingController;
import org.module.client.businesslogicservice.orderBLservice.SendingBLService;
import org.module.common.po.State;

public class SengdingListPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField sender;

	private SendingBLService controller = new SendingController();
	private JTextField ID;
	private JXDatePicker TimeChose;
	private JButton determine;
	/**
	 * Create the panel.
	 */
	public SengdingListPanel() {
		init();
		addListeners();
	}
	private void addListeners() {
		determine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.creat(TimeChose.getDate().getTime()+"", ID.getText(), sender.getText());
			}
		});
	}
	private void init(){
		JLabel lblNewLabel = new JLabel("派件单号");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 18));
		
		ID = new JTextField();
		ID.setFont(new Font("楷体", Font.PLAIN, 18));
		ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("派件员");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 18));
		
		sender = new JTextField();
		sender.setFont(new Font("楷体", Font.PLAIN, 18));
		sender.setColumns(10);
		
		JLabel label = new JLabel("收件日期");
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		
		determine = new JButton("确定");
		
		determine.setFont(new Font("楷体", Font.PLAIN, 20));
		
		TimeChose = new JXDatePicker();
		TimeChose.setDate(new Date());
		GroupLayout groupLayout = new GroupLayout(this);
		
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(TimeChose))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(167)
							.addComponent(determine, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(ID))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(33)
									.addComponent(sender, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))))
					.addGap(190))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(ID, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(TimeChose)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(sender, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(98)
					.addComponent(determine, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);

	}
}
