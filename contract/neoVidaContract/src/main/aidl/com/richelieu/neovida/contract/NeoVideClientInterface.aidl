package com.richelieu.neovida.contract;

import com.richelieu.neovida.contract.carrier.NeoRequest;
import com.richelieu.neovida.contract.carrier.NeoResponse;
import com.richelieu.neovida.contract.carrier.NeoCommand;
import com.richelieu.neovida.contract.carrier.NeoMessage;

interface NeoVideClientInterface {

    NeoResponse sendCommand(in NeoCommand neoCommand);

    NeoResponse sendMessage(in NeoMessage neoMessage);

    boolean connectWideRouter();

    boolean stopWideRouter();
}
