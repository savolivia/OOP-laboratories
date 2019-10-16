package Advanced_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

class SortComparator implements Comparator<Integer> {
    private final Map<String, Integer> freqMap;

    SortComparator(Map<String, Integer> tFreqMap) {
        ArrayList popularWords = new ArrayList();
        this.freqMap = tFreqMap;
        popularWords.add(this.freqMap);
        Collections.sort(popularWords);
    }

    public int compare(Integer k1, Integer k2) {
        int freqCompare = ((Integer)this.freqMap.get(k2)).compareTo((Integer)this.freqMap.get(k1));
        int valueCompare = k1.compareTo(k2);
        return freqCompare == 0 ? valueCompare : freqCompare;
    }
}
