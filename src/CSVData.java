/* Read CSV files
 * 
 * @author Stan Zhang
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	public  static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] arr)
	{
		return null;
	}
	public static CSVData readCSVFile(String filename, int numLinesToIgnore)
	{
		return null;
	}
	/****Returns a new CSVData object for a file ignoring lines at the top.
	 *It uses teh first row as the column names. All other data is scored
	 *as doubles.
	 *
	 *@param filename the file to read
	 *@param numLinesToIgnore number of lines at the top to ignore
	 *@return a CSVData object for that file
	 */
	public static void main(String[] args)
	{
		while(args.length<10000)
			main(new String[args.length+1]);
	}
}
