package com.example.precegabbysaina.driftshop.configurations;

import com.example.precegabbysaina.driftshop.R;
import com.example.precegabbysaina.driftshop.objects.Dashboard;

public class AppData {

    // store the dashboard data for the gridview
    static Dashboard[] dashboardData(){
        Dashboard[] d = {
                new Dashboard("Shop", R.mipmap.shop),
                new Dashboard("Shopping History", R.mipmap.shopping_history),
                new Dashboard("Payment Methods", R.mipmap.shopping_funds),
                new Dashboard("Hot Products", R.mipmap.shopping_hot_products),
                new Dashboard("Notifications", R.mipmap.shopping_notification),
                new Dashboard("Customer Support", R.mipmap.shopping_customer_support)
        };

        return d;
    }
}
