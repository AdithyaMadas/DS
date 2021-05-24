package com.madas.ds.Section10_Heaps.MaxHeapImpl;

public class Main {
    /*
    *
    * Heaps are special type of Binary trees.
    * Properties:
    *   * They are complete Binary trees, i.e other than the lowermost level, all the other levels are completed filled. Even in the lowest level, all the nodes have
    *       to be at the left most position.
    *   * There are 2 kinds of heaps:
    *       * Max heap: In max heaps, the parent node always have values greater than the child nodes, so in a max heap, the root element is the max element of the tree
    *       * Min heap: In min heaps, the parent node is always less than child nodes, so in min heap, the root element is the min element.
    *
    *   Heaps are implemented using arrays, this is possible because they are complete binary trees.
    *
    *       Indexes of array:
    *                                       					0
			                                        1					        2
		                                        3		    4			5			    6
                                            7		8	9		10	11		12 	    13		14
    *
    *  Left sub child for element at index i: (2*i) + 1
    *  Right sub child for element at index i: (2*i) + 2
    *
    * Parent for element at position at index i: floor((i-1)/2)
    * */

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

      /*  heap.printHeap();

        heap.delete(0);
        heap.printHeap();

        System.out.println(heap.peek());
*/
        heap.sort();
        heap.printHeap();
    }
}
