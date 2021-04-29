package org.d3if0044.hitungbmi.ui.histori

import androidx.lifecycle.ViewModel
import org.d3if0044.hitungbmi.db.BmiDao

class HistoriViewModel(db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}