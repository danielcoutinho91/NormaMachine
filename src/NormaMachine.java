import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Component;

import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class NormaMachine {

	private JFrame frmNormaMachine;
	private JTextField textFieldRegister0;
	private JTextField textFieldRegister1;
	JTextArea textAreaInstructions = new JTextArea();

	ArrayList<JLabel> labels = new ArrayList<JLabel>();
	JLabel labelLog00 = new JLabel("");
	JLabel labelLog01 = new JLabel("");
	JLabel labelLog02 = new JLabel("");
	JLabel labelLog03 = new JLabel("");
	JLabel labelLog04 = new JLabel("");
	JLabel labelLog05 = new JLabel("");
	JLabel labelLog06 = new JLabel("");
	JLabel labelLog07 = new JLabel("");
	JLabel labelLog08 = new JLabel("");
	JLabel labelLog09 = new JLabel("");
	JLabel labelLog10 = new JLabel("");
	JLabel labelLog11 = new JLabel("");
	JLabel labelLog12 = new JLabel("");
	JLabel labelLog13 = new JLabel("");
	JLabel labelLog14 = new JLabel("");
	JLabel labelLog15 = new JLabel("");
	JLabel labelLog16 = new JLabel("");
	JLabel labelLog17 = new JLabel("");
	JLabel labelLog18 = new JLabel("");
	JLabel labelLog19 = new JLabel("");
	JLabel labelLog20 = new JLabel("");
	JLabel labelLog21 = new JLabel("");
	JLabel labelLog22 = new JLabel("");
	JLabel labelLog23 = new JLabel("");
	JLabel labelLog24 = new JLabel("");
	JLabel labelLog25 = new JLabel("");
	JLabel labelLog26 = new JLabel("");
	JLabel labelLog27 = new JLabel("");
	JLabel labelLog28 = new JLabel("");
	JLabel labelLog29 = new JLabel("");
	JLabel labelLog30 = new JLabel("");
	JLabel labelLog31 = new JLabel("");
	JLabel labelLog32 = new JLabel("");
	JLabel labelLog33 = new JLabel("");
	JLabel labelLog34 = new JLabel("");
	JLabel labelLog35 = new JLabel("");
	JLabel labelLog36 = new JLabel("");
	JLabel labelLog37 = new JLabel("");
	JLabel labelLog38 = new JLabel("");
	JLabel labelLog39 = new JLabel("");
	JLabel labelLog40 = new JLabel("");
	JLabel labelLog41 = new JLabel("");
	JLabel labelLog42 = new JLabel("");

	ArrayList<JLabel> regs = new ArrayList<JLabel>();
	JLabel labelReg00 = new JLabel("R00 = 0");
	JLabel labelReg01 = new JLabel("R01 = 0");
	JLabel labelReg02 = new JLabel("R02 = 0");
	JLabel labelReg03 = new JLabel("R03 = 0");
	JLabel labelReg04 = new JLabel("R04 = 0");
	JLabel labelReg05 = new JLabel("R05 = 0");
	JLabel labelReg06 = new JLabel("R06 = 0");
	JLabel labelReg07 = new JLabel("R07 = 0");
	JLabel labelReg08 = new JLabel("R08 = 0");
	JLabel labelReg09 = new JLabel("R09 = 0");
	JLabel labelReg10 = new JLabel("R10 = 0");
	JLabel labelReg11 = new JLabel("R11 = 0");
	JLabel labelReg12 = new JLabel("R12 = 0");
	JLabel labelReg13 = new JLabel("R13 = 0");
	JLabel labelReg14 = new JLabel("R14 = 0");
	JLabel labelReg15 = new JLabel("R15 = 0");
	JLabel labelReg16 = new JLabel("R16 = 0");
	JLabel labelReg17 = new JLabel("R17 = 0");
	JLabel labelReg18 = new JLabel("R18 = 0");
	JLabel labelReg19 = new JLabel("R19 = 0");
	JLabel labelReg20 = new JLabel("R20 = 0");
	JLabel labelReg21 = new JLabel("R21 = 0");
	JLabel labelReg22 = new JLabel("R22 = 0");
	JLabel labelReg23 = new JLabel("R23 = 0");
	JLabel labelReg24 = new JLabel("R24 = 0");
	JLabel labelReg25 = new JLabel("R25 = 0");
	JLabel labelReg26 = new JLabel("R26 = 0");
	JLabel labelReg27 = new JLabel("R27 = 0");
	JLabel labelReg28 = new JLabel("R28 = 0");
	JLabel labelReg29 = new JLabel("R29 = 0");
	JLabel labelReg30 = new JLabel("R30 = 0");
	JLabel labelReg31 = new JLabel("R31 = 0");
	JLabel labelReg32 = new JLabel("R32 = 0");
	JLabel labelReg33 = new JLabel("R33 = 0");
	JLabel labelReg34 = new JLabel("R34 = 0");
	JLabel labelReg35 = new JLabel("R35 = 0");
	JLabel labelReg36 = new JLabel("R36 = 0");
	JLabel labelReg37 = new JLabel("R37 = 0");
	JLabel labelReg38 = new JLabel("R38 = 0");
	JLabel labelReg39 = new JLabel("R39 = 0");
	JLabel labelReg40 = new JLabel("R40 = 0");
	JLabel labelReg41 = new JLabel("R41 = 0");
	JLabel labelReg42 = new JLabel("R42 = 0");
	JLabel labelReg43 = new JLabel("R43 = 0");
	JLabel labelReg44 = new JLabel("R44 = 0");
	JLabel labelReg45 = new JLabel("R45 = 0");
	JLabel labelReg46 = new JLabel("R46 = 0");
	JLabel labelReg47 = new JLabel("R47 = 0");
	JLabel labelReg48 = new JLabel("R48 = 0");
	JLabel labelReg49 = new JLabel("R49 = 0");
	JLabel labelReg50 = new JLabel("R50 = 0");
	JLabel labelReg51 = new JLabel("R51 = 0");
	JLabel labelReg52 = new JLabel("R52 = 0");
	JLabel labelReg53 = new JLabel("R53 = 0");
	JLabel labelReg54 = new JLabel("R54 = 0");
	JLabel labelReg55 = new JLabel("R55 = 0");
	JLabel labelReg56 = new JLabel("R56 = 0");
	JLabel labelReg57 = new JLabel("R57 = 0");
	JLabel labelReg58 = new JLabel("R58 = 0");
	JLabel labelReg59 = new JLabel("R59 = 0");
	JLabel labelReg60 = new JLabel("R60 = 0");
	JLabel labelReg61 = new JLabel("R61 = 0");
	JLabel labelReg62 = new JLabel("R62 = 0");
	JLabel labelReg63 = new JLabel("R63 = 0");

	JLabel lblNewLabel = new JLabel("Instructions");
	JLabel labelRegisterIInput0 = new JLabel("Register 0: ");
	JLabel labelRegisterIInput1 = new JLabel("Register 1: ");

	JButton buttonRun = new JButton("Run");
	JButton buttonStep = new JButton("Step");
	JButton buttonLoad = new JButton("Load");
	JButton buttonReset = new JButton("Reset");

	private int[] registers;
	private ArrayList<String> instructions;

	private Stack<Integer> ifStack;

	private Stack<Integer> whileStack;
	private Stack<Integer> whileRegStack;
	private Stack<Integer> whileValueStack;
	private Stack<Integer> whileSignStack;
	private Stack<Integer> whileIndexStack;

	private Stack<Integer> forStack;
	private Stack<Integer> forRegStack;
	private Stack<Integer> forValueStack;
	private Stack<Integer> forSignStack;
	private Stack<Integer> forIndexStack;

	int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormaMachine window = new NormaMachine();
					window.frmNormaMachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NormaMachine() {
		initialize();

		buttonLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});

		buttonRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					run();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		buttonStep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				step();
			}
		});
		
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValues();
			}
		});
	}

	public void load() {
		registers = new int[64];
		for (int i = 0; i < registers.length; i++) {
			registers[i] = 0;
		}
		instructions = new ArrayList<String>();
		ifStack = new Stack<Integer>();
		whileStack = new Stack<Integer>();
		whileRegStack = new Stack<Integer>();
		whileValueStack = new Stack<Integer>();
		whileSignStack = new Stack<Integer>();
		whileIndexStack = new Stack<Integer>();
		forStack = new Stack<Integer>();
		forRegStack = new Stack<Integer>();
		forSignStack = new Stack<Integer>();
		forValueStack = new Stack<Integer>();
		forIndexStack = new Stack<Integer>();

		int i = 0;
		for (String line : textAreaInstructions.getText().split("\\n")) {
			labels.get(i).setText(line);
			labels.get(i).setBackground(Color.WHITE);
			instructions.add(line);
			i++;
		}
		textAreaInstructions.setEnabled(false);
		textFieldRegister0.setEnabled(false);
		textFieldRegister1.setEnabled(false);
		buttonRun.setEnabled(true);
		buttonStep.setEnabled(true);
		buttonLoad.setEnabled(false);
		
		if (!textFieldRegister0.getText().isEmpty()) {
			registers[0] = Integer.parseInt(textFieldRegister0.getText());			
		}
		
		if (!textFieldRegister1.getText().isEmpty()) {
			registers[1] = Integer.parseInt(textFieldRegister1.getText());			
		}

		labelReg00.setText("R00 = " + textFieldRegister0.getText());
		labelReg01.setText("R01 = " + textFieldRegister1.getText());

		index = 0;
		labels.get(index).setBackground(Color.GREEN);
	}

	public void run() throws InterruptedException {

		while (index < instructions.size()) {
			step();
		}
	}

	public void step() {
		index = executar(index);
		updateValues();

		if (index >= instructions.size()) {
			buttonRun.setEnabled(false);
			buttonStep.setEnabled(false);
			buttonReset.setEnabled(true);
		}
	}

	public void updateValues() {
		for (JLabel l : labels) {
			l.setBackground(Color.white);
		}
		
		labels.get(index).setBackground(Color.GREEN);

		int i = 0;
		for (JLabel r : regs) {
			if (i <= 9) {
				r.setText("R0" + i + " = " + registers[i]);
			} else {
				r.setText("R" + i + " = " + registers[i]);
			}
			i++;
		}
	}
	
	public void resetValues() {
		
		for (int i = 0; i < registers.length; i++) {
			registers[i] = 0;
		}
		
		for (JLabel l : labels) {
			l.setBackground(Color.white);
			l.setText("");
		}
		
		int i = 0;
		for (JLabel r : regs) {
			if (i <= 9) {
				r.setText("R0" + i + " = " + registers[i]);
			} else {
				r.setText("R" + i + " = " + registers[i]);
			}
			i++;
		}		
		
		buttonLoad.setEnabled(true);
		buttonReset.setEnabled(false);
		textAreaInstructions.setEnabled(true);
		textFieldRegister0.setEnabled(true);
		textFieldRegister1.setEnabled(true);
	}

	public int executar(int index) {
		String instruction = instructions.get(index);
		int nextIndex = index;

		// SetValue Register
		if (instruction.trim().startsWith("set0")) {
			String stringSet = instruction.trim().split(" ")[0];
			String stringIndex = instruction.trim().split(" ")[1];
			int rIndex = Integer.parseInt(stringIndex);
			int rValue = Integer.parseInt(stringSet.split("t")[1]);
			registers[rIndex] = rValue;
		}

		// Inc
		if (instruction.trim().startsWith("inc")) {
			int rIndex = Integer.parseInt(instruction.trim().split(" ")[1]);
			registers[rIndex]++;
		}

		// Dec
		if (instruction.trim().startsWith("dec")) {
			int rIndex = Integer.parseInt(instruction.trim().split(" ")[1]);
			if (registers[rIndex] > 0) {
				registers[rIndex]--;
			}
		}

		// If
		if (instruction.trim().startsWith("if")) {
			// if is0 1
			String condition = instruction.trim().split(" ")[1];
			int conditionValue = Integer.parseInt(condition.split("is")[1]);
			int rIndex = Integer.parseInt(instruction.trim().split(" ")[2]);

			if (registers[rIndex] == conditionValue) {
				nextIndex++;
			} else {
				ifStack.push(1);
				String nextInstruction = instruction;
				while (!ifStack.isEmpty()) {
					if (nextInstruction.equals("else") && ifStack.size() == 1) {
						nextIndex++;
						ifStack.pop();
						return nextIndex;
					}
					nextIndex++;
					nextInstruction = instructions.get(nextIndex).trim();
					if (nextInstruction.split(" ")[0].equals("if")) {
						ifStack.push(1);
					}
					if (nextInstruction.split(" ")[0].equals("endif")) {
						ifStack.pop();
					}
				}
			}
			return nextIndex;
		}

		// Else quando entrou no if
		if (instruction.trim().startsWith("else")) {
			ifStack.push(1);
			String nextInstruction = instruction;
			while (!ifStack.isEmpty()) {
				nextIndex++;
				nextInstruction = instructions.get(nextIndex).trim();
				if (nextInstruction.split(" ")[0].equals("if")) {
					ifStack.push(1);
				}
				if (nextInstruction.split(" ")[0].equals("endif")) {
					ifStack.pop();
				}
			}
			return nextIndex;
		}

		// Goto
		if (instruction.trim().startsWith("goto")) {
			String label = instruction.trim().split(" ")[1];
			for (String inst : instructions) {
				if (inst.trim().startsWith(":") && inst.trim().split(":")[1].equals(label)) {
					nextIndex = instructions.indexOf(inst);
					return nextIndex;
				}
			}
		}

		// While
		if (instruction.trim().startsWith("while")) {
			// while not0 1
			String condition = instruction.trim().split(" ")[1];
			int rIndex = Integer.parseInt(instruction.trim().split(" ")[2]);
			int conditionValue;
			int conditionSign;
			if (condition.startsWith("not")) {
				conditionSign = 0;
				conditionValue = Integer.parseInt(condition.split("t")[1]);
			} else {
				conditionSign = 1;
				conditionValue = Integer.parseInt(condition.split("s")[1]);
			}

			if (conditionSign == 0) {
				if (registers[rIndex] == conditionValue) {
					whileStack.push(1);
					String nextInstruction = instruction;
					while (!whileStack.isEmpty()) {
						nextIndex++;
						nextInstruction = instructions.get(nextIndex).trim();
						if (nextInstruction.split(" ")[0].equals("while")) {
							whileStack.push(1);
						}
						if (nextInstruction.split(" ")[0].equals("endwhile")) {
							whileStack.pop();
							nextIndex++;
						}
					}
					return nextIndex;
				}
			} else {
				if (registers[rIndex] != conditionValue) {
					whileStack.push(1);
					String nextInstruction = instruction;
					while (!whileStack.isEmpty()) {
						nextIndex++;
						nextInstruction = instructions.get(nextIndex).trim();
						if (nextInstruction.split(" ")[0].equals("while")) {
							whileStack.push(1);
						}
						if (nextInstruction.split(" ")[0].equals("endwhile")) {
							whileStack.pop();
						}
					}
					nextIndex++;
					return nextIndex;
				}
			}

			whileRegStack.push(rIndex);
			whileValueStack.push(conditionValue);
			whileSignStack.push(conditionSign);
			whileIndexStack.push(index + 1);

		}

		// Endwhile
		if (instruction.trim().startsWith("endwhile")) {
			int rIndex = whileRegStack.lastElement();
			int value = whileValueStack.lastElement();

			if (whileSignStack.lastElement() == 0) {
				if (registers[rIndex] != value) {
					nextIndex = whileIndexStack.lastElement();
				} else {
					nextIndex++;
					whileRegStack.pop();
					whileValueStack.pop();
					whileSignStack.pop();
					whileIndexStack.pop();
				}
				return nextIndex;
			} else {
				if (registers[rIndex] == value) {
					nextIndex = whileIndexStack.lastElement();
				} else {
					nextIndex++;
					whileRegStack.pop();
					whileValueStack.pop();
					whileSignStack.pop();
					whileIndexStack.pop();
				}
				return nextIndex;
			}
		}

		// For
		if (instruction.trim().startsWith("for")) {
			// for is0 1 dec
			String condition = instruction.trim().split(" ")[1];
			int rIndex = Integer.parseInt(instruction.trim().split(" ")[2]);
			String action = instruction.trim().split(" ")[3];
			int conditionValue = Integer.parseInt(condition.split("s")[1]);

			if (registers[rIndex] == conditionValue) {
				forStack.push(1);
				String nextInstruction = instruction;
				while (!forStack.isEmpty()) {
					nextIndex++;
					nextInstruction = instructions.get(nextIndex).trim();
					if (nextInstruction.split(" ")[0].equals("for")) {
						forStack.push(1);
					}
					if (nextInstruction.split(" ")[0].equals("endfor")) {
						forStack.pop();
						nextIndex++;
					}
				}
				return nextIndex;
			}

			forRegStack.push(rIndex);
			forValueStack.push(conditionValue);
			forIndexStack.push(index + 1);
			if (action.equals("inc")) {
				forSignStack.push(1);
			} else {
				forSignStack.push(-1);
			}

		}

		// Endfor
		if (instruction.trim().startsWith("endfor")) {
			int rIndex = forRegStack.lastElement();
			int value = forValueStack.lastElement();

			registers[rIndex] = registers[rIndex] + forSignStack.lastElement();
			if (registers[rIndex] != value) {
				nextIndex = forIndexStack.lastElement();
			} else {
				nextIndex++;
				forRegStack.pop();
				forValueStack.pop();
				forSignStack.pop();
				forIndexStack.pop();
			}
			return nextIndex;
		}

		// Set Ri Rj
		if (instruction.trim().startsWith("set ")) {
			String stringR1 = instruction.trim().split(" ")[1];
			String stringR2 = instruction.trim().split(" ")[2];
			int r1Index = Integer.parseInt(stringR1);
			int r2Index = Integer.parseInt(stringR2);
			registers[r1Index] = registers[r2Index];
		}

		// Add Ri Rj
		if (instruction.trim().startsWith("add ")) {
			String stringR1 = instruction.trim().split(" ")[1];
			String stringR2 = instruction.trim().split(" ")[2];
			int r1Index = Integer.parseInt(stringR1);
			int r2Index = Integer.parseInt(stringR2);
			registers[r1Index] = registers[r1Index] + registers[r2Index];
		}

		nextIndex++;
		return nextIndex;

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNormaMachine = new JFrame();
		frmNormaMachine.setTitle("Norma Machine");
		frmNormaMachine.setBounds(100, 100, 1100, 800);
		frmNormaMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNormaMachine.getContentPane().setLayout(null);

		textAreaInstructions.setBounds(10, 100, 350, 645);
		frmNormaMachine.getContentPane().add(textAreaInstructions);

		labelLog00.setBounds(370, 100, 300, 15);
		labelLog00.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog00);
		labels.add(labelLog00);

		labelLog01.setBounds(370, 115, 300, 15);
		labelLog01.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog01);
		labels.add(labelLog01);

		labelLog02.setBounds(370, 130, 300, 15);
		labelLog02.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog02);
		labels.add(labelLog02);

		labelLog03.setBounds(370, 145, 300, 15);
		labelLog03.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog03);
		labels.add(labelLog03);

		labelLog04.setBounds(370, 160, 300, 15);
		labelLog04.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog04);
		labels.add(labelLog04);

		labelLog05.setBounds(370, 175, 300, 15);
		labelLog05.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog05);
		labels.add(labelLog05);

		labelLog06.setBounds(370, 190, 300, 15);
		labelLog06.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog06);
		labels.add(labelLog06);

		labelLog07.setBounds(370, 205, 300, 15);
		labelLog07.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog07);
		labels.add(labelLog07);

		labelLog08.setBounds(370, 220, 300, 15);
		labelLog08.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog08);
		labels.add(labelLog08);

		labelLog09.setBounds(370, 235, 300, 15);
		labelLog09.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog09);
		labels.add(labelLog09);

		labelLog10.setBounds(370, 250, 300, 15);
		labelLog10.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog10);
		labels.add(labelLog10);

		labelLog11.setBounds(370, 265, 300, 15);
		labelLog11.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog11);
		labels.add(labelLog11);

		labelLog12.setBounds(370, 280, 300, 15);
		labelLog12.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog12);
		labels.add(labelLog12);

		labelLog13.setBounds(370, 295, 300, 15);
		labelLog13.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog13);
		labels.add(labelLog13);

		labelLog14.setBounds(370, 310, 300, 15);
		labelLog14.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog14);
		labels.add(labelLog14);

		labelLog15.setBounds(370, 325, 300, 15);
		labelLog15.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog15);
		labels.add(labelLog15);

		labelLog16.setBounds(370, 340, 300, 15);
		labelLog16.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog16);
		labels.add(labelLog16);

		labelLog17.setBounds(370, 355, 300, 15);
		labelLog17.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog17);
		labels.add(labelLog17);

		labelLog18.setBounds(370, 370, 300, 15);
		labelLog18.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog18);
		labels.add(labelLog18);

		labelLog19.setBounds(370, 385, 300, 15);
		labelLog19.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog19);
		labels.add(labelLog19);

		labelLog20.setBounds(370, 400, 300, 15);
		labelLog20.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog20);
		labels.add(labelLog20);

		labelLog21.setBounds(370, 415, 300, 15);
		labelLog21.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog21);
		labels.add(labelLog21);

		labelLog22.setBounds(370, 430, 300, 15);
		labelLog22.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog22);
		labels.add(labelLog22);

		labelLog23.setBounds(370, 445, 300, 15);
		labelLog23.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog23);
		labels.add(labelLog23);

		labelLog24.setBounds(370, 460, 300, 15);
		labelLog24.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog24);
		labels.add(labelLog24);

		labelLog25.setBounds(370, 475, 300, 15);
		labelLog25.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog25);
		labels.add(labelLog25);

		labelLog26.setBounds(370, 490, 300, 15);
		labelLog26.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog26);
		labels.add(labelLog26);

		labelLog27.setBounds(370, 505, 300, 15);
		labelLog27.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog27);
		labels.add(labelLog27);

		labelLog28.setBounds(370, 520, 300, 15);
		labelLog28.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog28);
		labels.add(labelLog28);

		labelLog29.setBounds(370, 535, 300, 15);
		labelLog29.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog29);
		labels.add(labelLog29);

		labelLog30.setBounds(370, 550, 300, 15);
		labelLog30.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog30);
		labels.add(labelLog30);

		labelLog31.setBounds(370, 565, 300, 15);
		labelLog31.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog31);
		labels.add(labelLog31);

		labelLog32.setBounds(370, 580, 300, 15);
		labelLog32.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog32);
		labels.add(labelLog32);

		labelLog33.setBounds(370, 595, 300, 15);
		labelLog33.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog33);
		labels.add(labelLog33);

		labelLog34.setBounds(370, 610, 300, 15);
		labelLog34.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog34);
		labels.add(labelLog34);

		labelLog35.setBounds(370, 625, 300, 15);
		labelLog35.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog35);
		labels.add(labelLog35);

		labelLog36.setBounds(370, 640, 300, 15);
		labelLog36.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog36);
		labels.add(labelLog36);

		labelLog37.setBounds(370, 655, 300, 15);
		labelLog37.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog37);
		labels.add(labelLog37);

		labelLog38.setBounds(370, 670, 300, 15);
		labelLog38.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog38);
		labels.add(labelLog38);

		labelLog39.setBounds(370, 685, 300, 15);
		labelLog39.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog39);
		labels.add(labelLog39);

		labelLog40.setBounds(370, 700, 300, 15);
		labelLog40.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog40);
		labels.add(labelLog40);

		labelLog41.setBounds(370, 715, 300, 15);
		labelLog41.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog41);
		labels.add(labelLog41);

		labelLog42.setBounds(370, 730, 300, 15);
		labelLog42.setOpaque(true);
		frmNormaMachine.getContentPane().add(labelLog42);
		labels.add(labelLog42);

		labelReg00.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg00.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg00.setBounds(680, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg00);
		regs.add(labelReg00);

		labelReg01.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg01.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg01.setBounds(740, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg01);
		regs.add(labelReg01);

		labelReg02.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg02.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg02.setBounds(800, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg02);
		regs.add(labelReg02);

		labelReg03.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg03.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg03.setBounds(860, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg03);
		regs.add(labelReg03);

		labelReg04.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg04.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg04.setBounds(920, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg04);
		regs.add(labelReg04);

		labelReg05.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg05.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg05.setBounds(980, 100, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg05);
		regs.add(labelReg05);

		labelReg06.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg06.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg06.setBounds(680, 145, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg06);
		regs.add(labelReg06);

		labelReg07.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg07.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg07.setBounds(740, 144, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg07);
		regs.add(labelReg07);

		labelReg08.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg08.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg08.setBounds(800, 144, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg08);
		regs.add(labelReg08);

		labelReg09.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg09.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg09.setBounds(860, 144, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg09);
		regs.add(labelReg09);

		labelReg10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg10.setBounds(920, 144, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg10);
		regs.add(labelReg10);

		labelReg11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg11.setBounds(980, 144, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg11);
		regs.add(labelReg11);

		labelReg12.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg12.setBounds(680, 191, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg12);
		regs.add(labelReg12);

		labelReg13.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg13.setBounds(740, 190, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg13);
		regs.add(labelReg13);

		labelReg14.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg14.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg14.setBounds(800, 190, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg14);
		regs.add(labelReg14);

		labelReg15.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg15.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg15.setBounds(860, 190, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg15);
		regs.add(labelReg15);

		labelReg16.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg16.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg16.setBounds(920, 190, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg16);
		regs.add(labelReg16);

		labelReg17.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg17.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg17.setBounds(980, 190, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg17);
		regs.add(labelReg17);

		labelReg18.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg18.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg18.setBounds(680, 236, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg18);
		regs.add(labelReg18);

		labelReg19.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg19.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg19.setBounds(740, 235, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg19);
		regs.add(labelReg19);

		labelReg20.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg20.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg20.setBounds(800, 235, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg20);
		regs.add(labelReg20);

		labelReg21.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg21.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg21.setBounds(860, 235, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg21);
		regs.add(labelReg21);

		labelReg22.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg22.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg22.setBounds(920, 235, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg22);
		regs.add(labelReg22);

		labelReg23.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg23.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg23.setBounds(980, 235, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg23);
		regs.add(labelReg23);

		labelReg24.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg24.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg24.setBounds(680, 280, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg24);
		regs.add(labelReg24);

		labelReg25.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg25.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg25.setBounds(740, 279, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg25);
		regs.add(labelReg25);

		labelReg26.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg26.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg26.setBounds(800, 279, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg26);
		regs.add(labelReg26);

		labelReg27.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg27.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg27.setBounds(860, 279, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg27);
		regs.add(labelReg27);

		labelReg28.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg28.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg28.setBounds(920, 279, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg28);
		regs.add(labelReg28);

		labelReg29.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg29.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg29.setBounds(980, 279, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg29);
		regs.add(labelReg29);

		labelReg30.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg30.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg30.setBounds(680, 326, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg30);
		regs.add(labelReg30);

		labelReg31.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg31.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg31.setBounds(740, 325, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg31);
		regs.add(labelReg31);

		labelReg32.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg32.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg32.setBounds(800, 325, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg32);
		regs.add(labelReg32);

		labelReg33.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg33.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg33.setBounds(860, 325, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg33);
		regs.add(labelReg33);

		labelReg34.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg34.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg34.setBounds(920, 325, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg34);
		regs.add(labelReg34);

		labelReg35.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg35.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg35.setBounds(980, 325, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg35);
		regs.add(labelReg35);

		labelReg36.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg36.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg36.setBounds(680, 370, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg36);
		regs.add(labelReg36);

		labelReg37.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg37.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg37.setBounds(740, 369, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg37);
		regs.add(labelReg37);

		labelReg38.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg38.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg38.setBounds(800, 369, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg38);
		regs.add(labelReg38);

		labelReg39.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg39.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg39.setBounds(860, 369, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg39);
		regs.add(labelReg39);

		labelReg40.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg40.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg40.setBounds(920, 369, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg40);
		regs.add(labelReg40);

		labelReg41.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg41.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg41.setBounds(980, 369, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg41);
		regs.add(labelReg41);

		labelReg42.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg42.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg42.setBounds(680, 415, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg42);
		regs.add(labelReg42);

		labelReg43.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg43.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg43.setBounds(740, 414, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg43);
		regs.add(labelReg43);

		labelReg44.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg44.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg44.setBounds(800, 414, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg44);
		regs.add(labelReg44);

		labelReg45.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg45.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg45.setBounds(860, 414, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg45);
		regs.add(labelReg45);

		labelReg46.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg46.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg46.setBounds(920, 414, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg46);
		regs.add(labelReg46);

		labelReg47.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg47.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg47.setBounds(980, 414, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg47);
		regs.add(labelReg47);

		labelReg48.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg48.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg48.setBounds(680, 460, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg48);
		regs.add(labelReg48);

		labelReg49.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg49.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg49.setBounds(740, 459, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg49);
		regs.add(labelReg49);

		labelReg50.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg50.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg50.setBounds(800, 459, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg50);
		regs.add(labelReg50);

		labelReg51.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg51.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg51.setBounds(860, 459, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg51);
		regs.add(labelReg51);

		labelReg52.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg52.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg52.setBounds(920, 459, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg52);
		regs.add(labelReg51);

		labelReg53.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg53.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg53.setBounds(980, 459, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg53);
		regs.add(labelReg53);

		labelReg54.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg54.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg54.setBounds(680, 505, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg54);
		regs.add(labelReg54);

		labelReg55.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg55.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg55.setBounds(740, 504, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg55);
		regs.add(labelReg55);

		labelReg56.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg56.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg56.setBounds(800, 504, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg56);
		regs.add(labelReg56);

		labelReg57.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg57.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg57.setBounds(860, 504, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg57);
		regs.add(labelReg57);

		labelReg58.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg58.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg58.setBounds(920, 504, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg58);
		regs.add(labelReg58);

		labelReg59.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg59.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg59.setBounds(980, 504, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg59);
		regs.add(labelReg59);

		labelReg60.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg60.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg60.setBounds(680, 550, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg60);
		regs.add(labelReg60);

		labelReg61.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg61.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg61.setBounds(740, 549, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg61);
		regs.add(labelReg61);

		labelReg62.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg62.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg62.setBounds(800, 550, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg62);
		regs.add(labelReg62);

		labelReg63.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelReg63.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		labelReg63.setBounds(860, 549, 50, 30);
		frmNormaMachine.getContentPane().add(labelReg63);
		regs.add(labelReg63);

		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 75, 70, 15);
		frmNormaMachine.getContentPane().add(lblNewLabel);

		labelRegisterIInput0.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelRegisterIInput0.setBounds(10, 15, 60, 15);
		frmNormaMachine.getContentPane().add(labelRegisterIInput0);

		textFieldRegister0 = new JTextField();
		textFieldRegister0.setBounds(70, 12, 30, 20);
		frmNormaMachine.getContentPane().add(textFieldRegister0);
		textFieldRegister0.setColumns(10);

		labelRegisterIInput1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		labelRegisterIInput1.setBounds(110, 14, 60, 15);
		frmNormaMachine.getContentPane().add(labelRegisterIInput1);

		textFieldRegister1 = new JTextField();
		textFieldRegister1.setColumns(10);
		textFieldRegister1.setBounds(170, 11, 30, 20);
		frmNormaMachine.getContentPane().add(textFieldRegister1);

		buttonRun.setBounds(370, 10, 90, 25);
		buttonRun.setEnabled(false);
		frmNormaMachine.getContentPane().add(buttonRun);

		buttonStep.setBounds(470, 10, 90, 25);
		buttonStep.setEnabled(false);
		frmNormaMachine.getContentPane().add(buttonStep);

		buttonLoad.setBounds(250, 10, 90, 25);
		frmNormaMachine.getContentPane().add(buttonLoad);		
		
		buttonReset.setBounds(250, 46, 89, 23);
		buttonReset.setEnabled(false);
		frmNormaMachine.getContentPane().add(buttonReset);
	}
}
