package com.richelieu.neovida.contract.internal;


import com.richelieu.neovida.contract.carrier.NeoRequest;

/**
 * 链式的
 *
 * @author richelieu  07.29 2018
 */
public interface Chainable {

    boolean doCheck(String identify, NeoRequest request);
}
