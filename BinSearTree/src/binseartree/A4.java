/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binseartree;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class A4 {

	static Scanner s = new Scanner(System.in);
	static mainS Root = null;

	public static void main(String[] args) {
		try {
			Manu obj = null; // display menu
			mainS Sr = new mainS(); // Starts the tree creation
			Root = Sr;
			Qs os = new Qs();

			// System.out.println(obj.ch); //Check

			do {
				obj = new Manu();
				switch (obj.ch) {
				case 1:
					Sr.treeStart();
					break;
				case 2: {
//[2].
					String str = null;
					do {
						try {
							str = JOptionPane
									.showInputDialog(" Traverse Binary Search Tree using DFS (Depth-First Search)\r\n"
											+ "[1] Pre-Order Traversing\r\n" + "[2] Post-Order Traversing\r\n"
											+ "[3] In-Order Traversing");
							switch (Integer.valueOf(str)) {
							case 1:
								os.pre(Sr.root);// Pre Order
								break;
							case 2:
								os.post(Sr.root);// post Order
								break;
							case 3:
								os.in(Sr.root);// In Order
								break;
							default:
								JOptionPane.showMessageDialog(null, "Invalid Entry!", "Warning!", 0);
								break;
							}
						} catch (NumberFormatException e) {
							if (str != null) {
								if (1 == Sr.yourChoice("Your Choice?", "Invalid Entry!\nWant to Retry?", "Yes", "No")) {
									str = null;
								}
							}
						}
					} while (str != null);
					break;
				}
				case 3:
//[3]. Find out the 2nd smallest and the 2nd largest node in the BS Tree
					os.p3(Sr.root);
					System.out.println("Largest  2nd: " + os.lar2);
					System.out.println("Smallest 2nd: " + os.S2);
					break;
				case 4:
//[4]. Find the Height of the BS Tree
					System.out.println("Depth Or Height of Tree:\n" + os.height(Sr.root));
					break;
				case 5:
//[5]. Search out the particular node in the BST
					System.out.print("Enter Node Value: ");
					os.findNode(Sr.root, s.nextInt());
					if (0 == os.chk) {
						System.out.println("Not Found!");
					}
					break;
				case 6:
//[6]. Display all nodes of particular level
					os.p6(Sr.root, 3, 0);
					break;
				case 7:
//[7]. Delete particular node in the BST
					Sr.root = os.P7(Sr.root, s.nextInt());
					break;
				case 8:
//[8]. Remove all leaf nodes in BST.
					Sr.root = os.P8(Sr.root);
					break;
				case 9:
//[9]. Count total leaf nodes in BST
					os.P9(Sr.root);
					System.out.println("Total leafs: " + os.chk);
					break;
				case 10:
//[10]. Find the distance between 2 nodes in BST
					break;
				default:
					// JOptionPane.showMessageDialog(null, "\n", "Warning!", 0);
					break;

				}
			} while (1 != Sr.yourChoice("Your Choice?", "Want Return to Main Manu?", "Yes", "No"));
		} catch (Exception ex) {
			System.out.println("ERROR!\nIn execution");
		}

	}

}