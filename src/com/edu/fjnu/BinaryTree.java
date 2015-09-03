package com.edu.fjnu;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * Created by gmy on 15-9-3.
 */
public class BinaryTree {



}

class Node {
    Node left;
    Node right;
    Node value;

    Node(){
        left = null;
        right = null;
        value = null;
    }

    Node(Node value){
        value = this.value;
        left = null;
        right = null;
    }

    void PreOrderPrint(){
        System.out.println(value.toString() + " ");
        if (left != null)
            left.PreOrderPrint();
        if (right != null)
            right.PreOrderPrint();
    }

    void InOrderPrint(){
        if (left != null)
            left.InOrderPrint();
        System.out.println(value.toString());
        if (right != null)
            right.InOrderPrint();
    }

    void PostOrderPrint(){
        if (left != null)
            left.PostOrderPrint();
        if(right != null)
            right.PostOrderPrint();
        System.out.println(value.toString() + " ");
    }

    void LevelOrderPrint(){
        if(this == null)
            throw new IllegalArgumentException("null node");
        Queue<Node> queue1 = new LinkedList<Node>();
        Queue<Node> queue2 = new LinkedList<Node>();

        queue1.add(this);
        while (queue1 != null || queue2 != null ){
            if (queue2.isEmpty()) {
                while (!queue1.isEmpty()) {
                    // 移除并返问队列头部的元素    如果队列为空，则返回null
                    Node currentNode = queue1.poll();
                    System.out.println(currentNode.value.toString() + " ");
                    if (currentNode.left != null)
                        queue2.add(currentNode.left);
                    if (currentNode.right != null)
                        queue2.add(currentNode.right);
                }
            } else{
                while (!queue2.isEmpty()){
                    Node currentNode = queue2.poll();
                    System.out.println(currentNode.value.toString() + " ");
                    if (currentNode.left != null)
                        queue1.add(currentNode.left);
                    if (currentNode.right != null)
                        queue1.add(currentNode.right);
                }
            }
        }

        System.out.println();

    }
}

