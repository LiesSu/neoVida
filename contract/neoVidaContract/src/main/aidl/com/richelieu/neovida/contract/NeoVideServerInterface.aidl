package com.richelieu.neovida.contract;

import com.richelieu.neovida.contract.carrier.NeoRequest;
import com.richelieu.neovida.contract.carrier.NeoResponse;
import com.richelieu.neovida.contract.carrier.NeoCommand;
import com.richelieu.neovida.contract.carrier.NeoMessage;

interface NeoVideServerInterface {

    NeoResponse reportCommand(in NeoCommand neoCommand);

    NeoResponse reportMessage(in NeoMessage neoMessage);


    //动态订阅
    //动态注册



    boolean stopWideRouter();
}
