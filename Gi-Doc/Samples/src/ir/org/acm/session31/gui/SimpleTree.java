package ir.org.acm.session31.gui;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SimpleTree extends JFrame implements TreeSelectionListener {

  private JTree tree;
  private JTextField currentSelectionField;

  public SimpleTree() {

    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
    DefaultMutableTreeNode child;
    DefaultMutableTreeNode grandChild;
    for(int childIndex=1; childIndex<4; childIndex++) {
      child = new DefaultMutableTreeNode("Child " + childIndex);
      root.add(child);
      for(int grandChildIndex=1; grandChildIndex<4; grandChildIndex++) {
        grandChild = new DefaultMutableTreeNode("Grandchild " + childIndex + "." + grandChildIndex);
        child.add(grandChild);
      }
    }
    tree = new JTree(root);
    tree.addTreeSelectionListener(this);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    currentSelectionField = new JTextField("Current Selection: NONE");
    getContentPane().add(currentSelectionField, BorderLayout.SOUTH);
    setSize(250, 275);
    setVisible(true);
  }

  public void valueChanged(TreeSelectionEvent event) {
    currentSelectionField.setText("Current Selection: " + tree.getLastSelectedPathComponent().toString());
  }

  public static void main(String[] args) {
    new SimpleTree();
  }

}
