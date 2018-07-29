package com.richelieu.neovida.contract.block;


import com.richelieu.neovida.contract.carrier.NeoRequest;
import com.richelieu.neovida.contract.unit.NeoCommandUnit;

/**
 * @author richelieu  07.29 2018
 */
public class NeoCommandBlock extends NeoBlock implements NeoCommandUnit {

    @Override
    public boolean doCheck(String identify, NeoRequest request) {
        return false;
    }
}
