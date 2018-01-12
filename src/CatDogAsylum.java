import java.util.*;

public class CatDogAsylum {
    public static void main(String[] args) {
        int[][] mat = {{1, -5}, {1, -1}, {1, 9}, {1, 9}, {2, 0}, {2, 1}, {1, -8}, {2, 1}, {1, -71}, {1, -92}, {1, 18}, {1, 91}, {1, 61}, {2, -1}, {1, -35}, {1, 95}, {1, -49}, {1, 9}, {1, 78}, {2, 0}, {1, 91}, {1, -96}, {2, -1}, {2, 0}, {2, -1}, {2, 1}, {1, 38}, {2, 0}, {1, 45}, {2, 0}, {1, -51}, {2, 1}, {2, 1}, {2, -1}, {1, 39}, {1, 59}, {1, 45}, {2, 0}, {1, -70}, {2, 0}, {1, 23}, {1, 88}, {1, 83}, {1, 69}, {1, -78}, {1, -3}, {1, -9}, {1, -20}, {1, -74}, {1, -62}, {1, 5}, {1, 55}, {1, -36}, {1, -21}, {1, -94}, {1, -27}, {1, -69}, {2, 0}, {1, -30}, {1, -84}, {2, 0}, {2, 0}, {2, -1}, {1, 92}, {1, 60}, {2, 1}, {2, 0}, {1, -63}, {2, 0}, {1, -87}, {1, 66}, {2, 0}, {1, 17}, {2, 0}, {2, 1}, {1, -41}, {1, -3}, {1, -29}, {1, 72}, {2, 1}, {1, 35}, {1, 81}, {1, -83}, {1, -17}, {1, 36}, {1, 99}, {1, -17}, {1, 8}, {2, 0}, {1, 80}, {1, 50}, {1, 80}, {2, 0}, {1, -48}, {1, -82}, {1, -63}, {1, 2}, {2, 1}, {1, -43}, {1, 59}, {1, 93}, {1, 55}, {1, -93}, {2, -1}, {1, 2}, {1, 13}, {2, 0}};

        ArrayList<Integer> list = asylum(mat);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> input = new ArrayList<Integer>();

        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < ope.length; i++) {
            //进收容所
            if (ope[i][0] == 1) {
                input.add(ope[i][1]);
            } else if (ope[i][0] == 2) {
                //猫或者狗按顺序出收容所
                if (ope[i][1] == 0) {
                    output.add(input.remove(0));
                } else if (ope[i][1] == -1) {
                    //猫出收容所
                    for (int j = 0; j < input.size(); j++) {
                        if (input.get(j).intValue() < 0) {
                            output.add(input.remove(j));
                            break;
                        }
                    }
                } else if (ope[i][1] == 1) {
                    for (int j = 0; j < input.size(); j++) {
                        if (input.get(j).intValue() > 0) {
                            output.add(input.remove(j));
                            break;
                        }
                    }
                }
            }
        }

        return output;
    }
}