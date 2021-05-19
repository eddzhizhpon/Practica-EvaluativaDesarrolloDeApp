package ups.edu.ec.congreso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ups.edu.ec.congreso.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("ENTRAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container,false)

        binding.buttonLogin.setOnClickListener{ view: View ->
            println(">>>>>>>>>>>>Login")
            view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        binding.buttonRegister.setOnClickListener{ view: View ->
            println("Regist")
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
//        return inflater.inflate(R.layout.fragment_login, container, false)
        return binding.root
    }
}