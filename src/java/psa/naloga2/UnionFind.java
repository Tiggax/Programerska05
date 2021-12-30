package psa.naloga2;


public class UnionFind {
	public int[] id;

	public UnionFind(int N) {
		this.id = new int[15];
		for (int i = 0; i < id.length; i++) {
			this.id[i] = i;
		}
	}

	/*
	 * Metoda sprejme index in vrne predstavnika mnozice, katere clan je index.
	 */
	public int find(int i) {
		while ( i != id[i] ) {
			i = id[i];
		}
		return i;
	}

	/*
	 * Metoda sprejme da indexa in naredi unijo
	 */
	public void unite(int p, int q) {
		// q je v p-ju -> od p-ja koren vzames
		id[q] = find(p);
	}

	/*
	 * Metoda vrne true, ce sta p in q v isti mnozici
	 */
	public boolean isInSameSet(int p, int q) {
		int korp = find(p);
		int korq = find(q);
		if ( korp == korq ) {
			return true;
		} else {
			return false;
		} 
	}
}
