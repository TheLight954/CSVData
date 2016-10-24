
public class StepCounting {
	public static double getMean(double[] sample)
	{
		double ans=0;
		for(int i=0; i<sample.length; i++)
		{
			ans+=sample[i];
		}
		ans=ans/sample.length;
		return ans;
	}
	public static double getStandardDeviation(double[] arr, double mean)
	{
		double ans=0;
		for(int i=0; i<arr.length; i++)
		{
			ans=ans+(mean-arr[i])*(mean-arr[i]);
		}
		ans=ans/arr.length;
		return Math.sqrt(ans);
	}
	public static boolean isPeak(double cur, double mean, double StandardDeviation)
	{
		if(cur>(mean+1.6*StandardDeviation))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private static double[] calculateMagnitudesFor(double[][] sensorData)
	{
		double[] sample = new double[sensorData.length];
		for(int i=0; i<sample.length; i++)
		{
			sample[i] = calculateMagnitude(sensorData[i][0], sensorData[i][1], sensorData[i][2]);
		}	
		return sample;
	}
	private static int countSteps(double[] times, doublre[][] sensorData)
	{
		double[] sample = calculateMagnitudesFor(sensorData);
		double x=getMean(sample);
		double y=getStandardDeviation(sample, x);
		int ans=0;
		for(int i=0; i<sample.length; i++)
		{
			if(isPeak(sample[i], x, y)&&(i==(sample.length-1)||!isPeak(sample[i+1], x, y)))
			{
				ans++;
			}
		}
		return ans;
	}
	public static double calculateMagnitude(double x, double y, double z) {
		return Math.sqrt(x*x+y*y+z*z);
	}
}
