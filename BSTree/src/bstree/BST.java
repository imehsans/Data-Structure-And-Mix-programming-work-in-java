/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author Admin
 */
class BST{
        BSTNode root;
 
     /* Constructor */
        public BST(){
            root = null;
        }
     /* Function to check if tree is empty */
        public boolean isEmpty(){
            return root == null;
        }
     /* Functions to insert data */
        public void insert(int data){
            root = insert(root, data);
        }
     /* Function to insert data recursively */
        public BSTNode insert(BSTNode node, int data){
            if (node == null)
                node = new BSTNode(data);
            else{
                if (data <= node.getData())
                    node.left = insert(node.left, data);
                else
                    node.right = insert(node.right, data);
            }
            return node;
        }
     /* Functions to delete data */
        public void delete(int k){
            if (isEmpty())
                System.out.println("Tree Empty");
            else if (search(k) == false)
                System.out.println("Sorry "+ k +" is not present");
            else{
                root = delete(root, k);
                System.out.println(k+ " deleted from the tree");
            }
        }
        public BSTNode delete(BSTNode root, int k){
            BSTNode p, p2, n;
            if (root.getData() == k){
                BSTNode lt, rt;
                lt = root.getLeft();
                rt = root.getRight();
                if (lt == null && rt == null)
                    return null;
                else if (lt == null){
                    p = rt;
                    return p;
                }
                else if (rt == null){
                    p = lt;
                    return p;
                }
                else{
                    p2 = rt;
                    p = rt;
                    while (p.getLeft() != null)
                        p = p.getLeft();
                    p.setLeft(lt);
                    return p2;
                }
            }
            if (k < root.getData()){
                n = delete(root.getLeft(), k);
                root.setLeft(n);
            }
            else{
                n = delete(root.getRight(), k);
                root.setRight(n);             
            }
            return root;
        }
    
     /* Functions to search for an element */
        public boolean search(int val){
            return search(root, val);
        }
     /* Function to search for an element recursively */
        public boolean search(BSTNode r, int val){
            boolean found = false;
            while ((r != null) && !found){
                int rval = r.getData();
                if (val < rval)
                    r = r.getLeft();
                else if (val > rval)
                    r = r.getRight();
                else{
                    found = true;
                    break;
                }
                found = search(r, val);
            }
            return found;
        }
     /* Function for inorder traversal */
        public void inorder(){
            inorder(root);
        }
        public void inorder(BSTNode r){
            if (r != null){
                inorder(r.getLeft());
                System.out.print(r.getData() +" ");
                inorder(r.getRight());
            }
        }
     /* Function for preorder traversal */
        public void preorder(){
            preorder(root);
        }
        public void preorder(BSTNode r){
            if (r != null){
                System.out.print(r.getData() +" ");
                preorder(r.getLeft());             
                preorder(r.getRight());
            }
        }
     /* Function for postorder traversal */
        public void postorder(){
            postorder(root);
        }
        public void postorder(BSTNode r){
            if (r != null){
                postorder(r.getLeft());             
                postorder(r.getRight());
                System.out.print(r.getData() +" ");
            }
        }
        int height(BSTNode root) {// [4]. Find the Height of the BS Tree
		if (root == null) {
			return 0;
		} else {
			int dptL = height(root.left);
			int dptR = height(root.right);

			if (dptL > dptR) {
				return dptL + 1;
			} else {
				return dptR + 1;
			}
		}
	}

	int chk = 0; // [5]. Search out the particular node in the BST

	void searchPertic(BSTNode ptr, int nodeValue) {
		if (ptr == null) {
			System.out.println("Tree is Null");
		} else if (nodeValue == ptr.data) {
			System.out.println("Founded it");
			chk = 1;
		} else if (ptr.data > nodeValue) {
			searchPertic(ptr.left, nodeValue);
		} else {
			searchPertic(ptr.right, nodeValue);
		}
	}

	void Display(BSTNode root, int onLevel, int level) {// [6]. Display all nodes of particular level
		if (level == onLevel) {
			System.out.println(root.data + "--Found it on Level " + level);
		} else {
			if (root.left != null) {
				Display(root.left, onLevel, level + 1);
			}
			if (root.right != null) {
				Display(root.right, onLevel, level + 1);
			}
		}
	}

	BSTNode temp = null;

	BSTNode display(BSTNode root, int value) {
		if (root == null) {
			System.out.println("Null Tree");
			return null;
		}

		if (root.data > value) {
			root.left = display(root.left, value);
		}

		else if (root.data < value) {
			root.right = display(root.right, value);

		} else {
			// if nodeToBeDeleted have both children
			if (root.left != null && root.right != null) {
				 temp = root;
				// Finding minimum element from R
				(temp.right);
				// Replacing current node with minimum node from R subtree
				root.data = S1;
				// Deleting minimum node from R now
				display(root.R, S1);

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

	BST P9(BST root) {// [9]. Count total leaf nodes in BST
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

    }
