import UIKit
import UserNotifications
import Firebase

@objc(CallPlugin) class CallPlugin: CDVPlugin {
    @objc(handleCall:)
    func handleCall(command: CDVInvokedUrlCommand) {
        // Handle call initiation or other logic here
        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: "Call handled")
        self.commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }
}
