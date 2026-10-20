
package datastructure.assigment_problems;

import java.util.Scanner;
import java.util.Arrays;

public class DutyRosterRotation {

    static void rotateRight(String[] names, int k) {
        int n = names.length;
        k = k % n;

        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = names[i];
        }

        for (int i = 0; i < n; i++) {
            names[i] = rotated[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        int k = sc.nextInt();

        rotateRight(names, k);
        System.out.println(Arrays.toString(names));

        sc.close();
    }
}
