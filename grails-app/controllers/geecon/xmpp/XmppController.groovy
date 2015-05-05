package geecon.xmpp

class XmppController {

    def xmppService

    def chat(String msg) {
        msg = msg ?: "Hello GeeCON from Spring Integration XMPP!"

        xmppService.sendMessage(msg)

        render "Done!"
    }
}
