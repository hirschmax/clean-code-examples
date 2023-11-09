package com.github.hirschm.solid.isp.bad;

public class OnlineClient implements RestaurantInterface {
    @Override
    public void acceptOnlineOrder() {
        // ...
    }

    @Override
    public void payOnline() {
        // ...
    }

    @Override
    public void walkInCustomerOrder() {
        throw new RuntimeException("Not applicable for online client!");
    }

    @Override
    public void payInPerson() {
        throw new RuntimeException("Not applicable for online client!");
    }
}
