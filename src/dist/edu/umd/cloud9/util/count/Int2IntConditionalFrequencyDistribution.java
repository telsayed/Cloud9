package edu.umd.cloud9.util.count;

/**
 * A conditional frequency distribution where events are ints and counts are ints.
 *
 * @author Jimmy Lin
 *
 */
public interface Int2IntConditionalFrequencyDistribution {

	/**
	 * Sets the observed frequency of <code>k</code> conditioned on <code>cond</code> to <code>v</code>.
	 */
	public void set(int k, int cond, int v);

	/**
	 * Increments the observed frequency of <code>k</code> conditioned on <code>cond</code>.
	 */
	public void increment(int k, int cond);

	/**
	 * Increments the observed frequency of <code>k</code> conditioned on <code>cond</code> by <code>v</code>.
	 */
	public void increment(int k, int cond, int v);

	/**
	 * Returns the observed frequency of <code>k</code> conditioned on <code>cond</code>.
	 */
	public int get(int k, int cond);

	/**
	 * Returns the marginal count of <code>k</code>. That is, sum of counts of
	 * <code>k</code> conditioned on all <code>cond</code>.
	 */
	public int getMarginalCount(int k);

	/**
	 * Returns the frequency distribution conditioned on <code>cond</code>.
	 */
	public Int2IntFrequencyDistribution getConditionalDistribution(int cond);

	/**
	 * Returns the sum of all frequencies.
	 */
	public long getSumOfAllFrequencies();

	/**
	 * Performs an internal consistency check of this data structure. An
	 * exception will be thrown if an error is found.
	 */
	public void check();
}
