package uz.anorgroup.doonkdriver.presentation.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkdriver.R
import uz.anorgroup.doonkdriver.databinding.ScreenVehicleTypeBinding

@AndroidEntryPoint
class VehicleScreen : Fragment(R.layout.screen_vehicle_type) {
    private val bind by viewBinding(ScreenVehicleTypeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.addCarBt.setOnClickListener {
            findNavController().navigate(R.id.action_vehicleScreen_to_seatScreen)
        }
    }
}