/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binseartree;

/**
 *
 * @author Admin
 */

    import javax.swing.JOptionPane;
import java.util.Scanner;

class Manu {
	public int ch;
	String str;

	Manu() {
		try {
			str = JOptionPane.showInputDialog("[1]. Create Binary Search Tree\n"
					+ "[2]. Traverse Binary Search Tree using DFS (Depth-First Search)\r\n"
					+ "[3]. Find out the 2nd smallest and the 2nd largest node in the BS Tree\r\n"
					+ "[4]. Find the Height of the BS Tree\r\n" + "[5]. Search out the particular node in the BST\r\n"
					+ "[6]. Display all nodes of particular level\r\n" + "[7]. Delete particular node in the BST\r\n"
					+ "[8]. Remove all leaf nodes in BST\r\n" + "[9]. Count total leaf nodes in BST\r\n"
					+ "[10]. Find the distance between 2 nodes in BST\r\n" + "My choice:");
			this.ch = Integer.valueOf(str);
		} catch (NumberFormatException e) {
			if (str == null) {
				System.exit(0);
			}
		}
	}
}

class Qs {
	static Scanner s = new Scanner(System.in);
	int data;
	Qs L, R;

	// Binary Search Tree CREATION
	void createBST(Qs ptr) {
		Qs temp = null;
		Qs newNode = new Qs();
		newNode.data = Integer.valueOf(JOptionPane.showInputDialog(null, "Input Data:"));
		newNode.L = null;
		newNode.R = null;
		while (ptr != null) {
			if (newNode.data < ptr.data) {
				temp = ptr;
				ptr = ptr.L;
			} else {
				temp = ptr;
				ptr = ptr.R;
			}
		}
		if (newNode.data < temp.data) {
			temp.L = newNode;
		} else {
			temp.R = newNode;
		}
	}

	// pre order
	void pre(Qs ptr) {
		if (ptr != null) {
			System.out.println(ptr.data);
			pre(ptr.L);
			pre(ptr.R);

		}
	}

	// post order
	void post(Qs ptr) {
		if (ptr != null) {
			post(ptr.L);
			post(ptr.R);
			System.out.println(ptr.data);

		}
	}

	// In order
	void in(Qs ptr) {
		if (ptr != null) {
			in(ptr.L);
			System.out.print(ptr.data + " ");
			in(ptr.R);

		}
	}

	int lar1 = 0, lar2 = 0, S1 = 99999999, S2;

	void p3(Qs ptr) {// [3]. Find out the 2nd smallest and the 2nd largest node in the BS Tree
		if (ptr != null) {
			if (ptr.data > lar1) {
				lar2 = lar1;
				lar1 = ptr.data;
			} else if (ptr.data > lar2) {
				lar2 = ptr.data;
			}
			if (ptr.data < S1) {
				S2 = S1;
				S1 = ptr.data;
			} else if (ptr.data < S2) {
				S2 = ptr.data;
			}
			p3(ptr.L);
			p3(ptr.R);
		}
	}

	int height(Qs root) {// [4]. Find the Height of the BS Tree
		if (root == null) {
			return 0;
		} else {
			int dptL = height(root.L);
			int dptR = height(root.R);

			if (dptL > dptR) {
				return dptL + 1;
			} else {
				return dptR + 1;
			}
		}
	}

	int chk = 0; // [5]. Search out the particular node in the BST

	void findNode(Qs ptr, int nodeValue) {
		if (ptr == null) {
			System.out.println("Tree is Null");
		} else if (nodeValue == ptr.data) {
			System.out.println("Founded it");
			chk = 1;
		} else if (ptr.data > nodeValue) {
			findNode(ptr.L, nodeValue);
		} else {
			findNode(ptr.R, nodeValue);
		}
	}

	void p6(Qs root, int onLevel, int level) {// [6]. Display all nodes of particular level
		if (level == onLevel) {
			System.out.println(root.data + "--Found it on Level " + level);
		} else {
			if (root.L != null) {
				p6(root.L, onLevel, level + 1);
			}
			if (root.R != null) {
				p6(root.R, onLevel, level + 1);
			}
		}
	}

	Qs p7Temp = null;

	Qs P7(Qs root, int value) {
		if (root == null) {
			System.out.println("Null Tree");
			return null;
		}

		if (root.data > value) {
			root.L = P7(root.L, value);
		}

		else if (root.data < value) {
			root.R = P7(root.R, value);

		} else {
			// if nodeToBeDeleted have both children
			if (root.L != null && root.R != null) {
				Qs temp = root;
				// Finding minimum element from R
				p3(temp.R);
				// Replacing current node with minimum node from R subtree
				root.data = S1;
				// Deleting minimum node from R now
				P7(root.R, S1);

			}
			// if nodeToBeDeleted has only L child
			else if (root.L != null) {
				root = root.L;
			}
			// if nodeToBeDeleted has only R child
			else if (root.R != null) {
				root = root.R;
			}
			// if nodeToBeDeleted do not have child (Leaf node)
			else
				root = null;
		}
		return root;
	}

	Qs P8(Qs root) { // [8]. Remove all leaf nodes in BST.
		if (root == null)
			return null;

		else if (root.L == null && root.R == null) {
			System.out.println("\nRemoved leaf:" + root.data);
			root = null;
		}

		else {
			root.L = P8(root.L);
			root.R = P8(root.R);
		}
		return root;
	}

	Qs P9(Qs root) {// [9]. Count total leaf nodes in BST
		if (root == null)
			return null;

		else if (root.L == null && root.R == null) {
			System.out.println(++chk + "st Leaf Value: " + root.data);
		}

		else {
			root.L = P9(root.L);
			root.R = P9(root.R);
		}
		return root;
	}

	void P10() {
		// Not Developed Yet.
	}
}

class mainS {// main Root node Creation Binary Search Tree
	private Qs ob = new Qs();
	Qs root = new Qs();

	void treeStart() {
		root.data = Integer.valueOf(JOptionPane.showInputDialog(null, "Input Data:"));
		root.L = null;
		root.R = null;
		char ch = 'y';
		while (ch != 'n') {
			ob.createBST(root);
			String ss = JOptionPane.showInputDialog("Add More(n for No)");
			ch = ss.charAt(0);
		}
	}

	// Extra functions
	int yourChoice(String msg, String title, String option_1, String option_2) {
		// display the showOptionDialog
		Object[] options = { option_1, option_2 };
		int choice = JOptionPane.showOptionDialog(null, title, msg, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		return choice;

	}

}
