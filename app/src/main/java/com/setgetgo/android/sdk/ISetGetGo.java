package com.setgetgo.android.sdk;

import com.setgetgo.android.sdk.Models.Payment;

import org.json.JSONObject;

public interface ISetGetGo
{
    /**
     * @param payment The payment data.
     * @return The JSON representation of the payment response.
     */
    JSONObject CreatePayment(Payment payment);

    /**
     * @param paymentAddress The payment data.
     * @return The JSON representation of the payment status.
     */
    JSONObject GetPayment(String paymentAddress);

    /**
     * @param currencyCode The currency code.
     * @return The JSON representation of the rate data..
     */
    JSONObject GetRate(String currencyCode);
}
