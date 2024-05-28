package com.dostonbek.firstpdfreader

import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.dostonbek.firstpdfreader.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launchPDF.launch("application/pdf")


    }

    private val launchPDF = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        uri?.let {
            binding.pdfView.fromUri(it)
                .spacing(12)
                .defaultPage(0)
                .enableDoubletap(true)
                .enableAnnotationRendering(false)
                .load()
            binding.pdfView.fitToWidth()
            binding.pdfView.useBestQuality(true)
        }

    }
}