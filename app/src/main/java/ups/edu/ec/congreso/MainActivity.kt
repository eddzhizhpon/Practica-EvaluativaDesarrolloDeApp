package ups.edu.ec.congreso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ups.edu.ec.congreso.databinding.FragmentLoginBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.fragment_login)

        binding.buttonLogin.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        binding.buttonRegister.setOnClickListener{ view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}