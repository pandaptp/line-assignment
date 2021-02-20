import java.util.ArrayList;

public class findDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {2,4,88,2,78,88,34};
		System.out.println("input: " + data);
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		ArrayList<Integer> tempResult = new ArrayList<Integer>();
		ArrayList<Integer> tempCount = new ArrayList<Integer>();
		for(int id: data) {
			dataList.add(id);
		}
		System.out.println(dataList);
		
		for(int i = 0; i < dataList.size(); i++) {
			if(!tempCount.contains(dataList.get(i))) {
				tempCount.add(dataList.get(i));
			} else {
				if(!tempResult.contains(dataList.get(i))) {
					tempResult.add(dataList.get(i));
				}
			}
		}
		
		System.out.println("result: " + tempResult);
		
	}

}
