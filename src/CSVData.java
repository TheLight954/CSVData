import java.io.IOException;
import java.util.Scanner;

/* Read CSV files
 * 
 * @author Stan Zhang
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public static String readFiletoString(String filepath) {
		StringBuilder output = new StringBuilder();

		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] arr) {

	}

	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		String n = readFiletoString(filename);
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

	public double[] getColumn(String name) {
		return null;
	}

	/****
	 * Returns a new CSVData object for a file ignoring lines at the top. It
	 * uses teh first row as the column names. All other data is scored as
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
