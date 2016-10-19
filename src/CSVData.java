import java.io.IOException;
import java.util.Scanner;
/* Read CSV files
 * 
 * @author Stan Zhang
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	public static int lineCounter (String filepath){
		int count = 0;
		Scanner input = new Scanner(new File(filepath));
		while (input.hasNextLine()) {
		    count++;
		}
		return count;
	}
	public static String[] readFiletoString(String filepath) {
		String[] ans = new String[lineCounter(filepath)]
		try {
		File file = new File(filepath);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		int counter = 0;
		while (bufferedReader.readLine() != null) {
			ans[counter]=bufferedReader.readLine();
			counter++;
		}
		fileReader.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
		return ans;
	}

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] arr) {
		CSVData k = new CSVData();
		String[] n = readFiletoString(filename);
		int counter;
		int cur;
		int cur1;
		for(int i=numLinesToIgnore; i<n.length; i++)
		{
			counter=0;
			for(int j=0; j<n.length; j++)
			{
				cur1=0;
				cur = n[i].charAt(j)-'0';
				while(0<=cur&&cur<=9)
				{
					cur1=cur1*10+cur;
					j++;
					cur = n[i].charAt(j)-'0';
				}
				k.data[i-numLinesToIgnore][counter]=cur1;
				counter++;
			}
		}
		return k;
	}

	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {

	}

	public double[][] getColumns(int startIndex, int endIndex) {
		double[][] ans = new double[endIndex - startIndex + 1][data.length];
		for (int i = startIndex; i <= endIndex; i++) {
			ans[i - startIndex] = getColumn(i);
		}
		return ans;
	}

	public double[][] getRows(int startIndex, int endIndex) {
		double[][] ans = new double[endIndex - startIndex + 1][data[0].length];
		for (int i = startIndex; i < endIndex; i++) {
			ans[i - startIndex] = getRow(i);
		}
		return ans;
	}

	public double[] getRow(int rowIndex) {
		return data[rowIndex];
	}

	public double[] getColumn(int colIndex) {
		double[] ans = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			ans[i] = data[i][colIndex];
		}
		return ans;
	}

	/****
	 * Returns a new CSVData object for a file ignoring lines at the top. It
	 * uses the first row as the column names. All other data is scored as
	 * doubles.
	 *
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static void main(String[] args) {
	}
}
