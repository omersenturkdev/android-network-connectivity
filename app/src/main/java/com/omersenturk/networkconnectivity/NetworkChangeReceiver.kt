package com.omersenturk.networkconnectivity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.widget.Toast

class NetworkChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == ConnectivityManager.CONNECTIVITY_ACTION) {
            val connectivityManager =
                context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val network = connectivityManager.activeNetwork
            val capabilities = connectivityManager.getNetworkCapabilities(network)

            if (capabilities?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) == true) {
                when {
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                        Toast.makeText(context, "Network Connected with Wi-Fi", Toast.LENGTH_SHORT)
                            .show()
                    }

                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                        Toast.makeText(
                            context,
                            "Network Connected with Cellular",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            } else {
                Toast.makeText(context, "Network Disconnected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}