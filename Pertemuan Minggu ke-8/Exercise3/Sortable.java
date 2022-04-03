/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

interface Sortable{ 
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){ 
        //Shell sort body
        int n = a.length;
        int incr = n / 2;
        while (incr >= 1)
        {
            for (int i = incr; i < n; i++){
                Sortable temp = a[i];
                int j = i;
                while (j >= incr && temp.compare(a[j - incr]) < 0){
                    a[j] = a[j - incr];
                    j -= incr;
                }
                a[j] = temp;
            }
            incr /= 2;
        }
    }
 
}

