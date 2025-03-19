public class DataDosen15 {
    Dosen15 dataDosen15[] = new Dosen15[10];
    int idx = 0;
    void tambah(Dosen15 dsn) {
        if (idx < dataDosen15.length) {
            dataDosen15[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen15[i].tampil();
        }
    }
    void sortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen15[j].usia > dataDosen15[j + 1].usia) {
                    Dosen15 temp = dataDosen15[j];
                    dataDosen15[j] = dataDosen15[j + 1];
                    dataDosen15[j + 1] = temp;
                }
            }
        }
    }
    void sortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen15[j].usia > dataDosen15[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen15 temp = dataDosen15[maxIdx];
            dataDosen15[maxIdx] = dataDosen15[i];
            dataDosen15[i] = temp;
        }
    }
}

