public class MergeTwoSortedLists {
    int val;
    MergeTwoSortedLists next;
    MergeTwoSortedLists() {}
    MergeTwoSortedLists(int val) { this.val = val; }
    MergeTwoSortedLists(int val, MergeTwoSortedLists next) { this.val = val; this.next = next; }
    public MergeTwoSortedLists mergeTwoLists(MergeTwoSortedLists list1, MergeTwoSortedLists list2) {
        MergeTwoSortedLists temp_node = new MergeTwoSortedLists();
        MergeTwoSortedLists main_node = temp_node;

        while (list1 != null && list2 != null){

            if (list1.val < list2.val){
                main_node.next = list1;
                list1 = list1.next;
            } else {
                main_node.next = list2;
                list2 = list2.next;
            }

            main_node = main_node.next;
        }

        if (list1 != null) {
            main_node.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            main_node.next = list2;
            list2 = list2.next;
        }

        return temp_node.next;
    }
}
