package com.richelieu.neovida.contract.block;


import com.richelieu.neovida.contract.carrier.NeoRequest;
import com.richelieu.neovida.contract.unit.NeoMessageUnit;

/**
 * @author richelieu  07.29 2018
 */
public class NeoFullBlock extends NeoBlock implements NeoMessageUnit{

    @Override
    public boolean doCheck(String identify, NeoRequest request) {
        return false;
    }
}
