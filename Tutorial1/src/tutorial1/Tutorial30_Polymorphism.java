/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author kevin
 */
public class Tutorial30_Polymorphism {
    public static void main(String[] args) {
        Tutorial30_Plant plant1=new Tutorial30_Plant();
        Tutorial30_Tree tree=new Tutorial30_Tree();
        
        Tutorial30_Plant plant2=tree;
        
        plant2.grow();
        
        tree.shedLeaves();
        
//        plant2.shedLeaves();
//        plant1.grow();

        doGrow(tree);
    }
    public static void doGrow(Tutorial30_Plant plant) {
        plant.grow();
    }
}
