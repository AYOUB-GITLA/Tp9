package exercice2;

import java.util.List;

public class TestFile {

	public static void main(String[] args) {

		
        List<Integer> nums = FileUtil.readNumbers("numbers.txt");

        System.out.println("Nombres lus : " + nums);
	}

}
