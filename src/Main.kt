fun main() {
    val devices= SmartHome()
    devices.tv.turnOn()
    devices.light.turnOn()

    devices.decraeseVolume()
    devices.changeTvChannelToPrevious()
    devices.printSmartTvInfo()
    devices.printSmartLightInfo()
    devices.decraeseLightBrightness()
}

open class SmartDevice(private val name:String, private val category:String, private val deviceType:String) {
    var deviceStatus:String = "Off"
    private var deviceTurnOnCount:Int = 0

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

    fun turnOn() {
        if (deviceStatus == "Off") {
            deviceStatus = "On"
            deviceTurnOnCount++
        }
    }

    fun turnOff() {
        if (deviceStatus == "On") {
            deviceStatus = "Off"
        }
    }
}




    class SmartTvDevice(name: String, category: String):SmartDevice(name,category, "TV"){

        private var volume:Int=34
        private var currentChannel:Int=56

        fun decreaseVolume() {
            if(volume>0){
                volume--
            }
            println("Volume decreased to $volume.")
        }

        fun previousChannel() {
            if(currentChannel>1){
                currentChannel++
            }
            println("Switched to previous channel to $currentChannel.")
        }
    }

class SmartLightDevice(name:String, category: String):SmartDevice(name, category, "Light"){
    private var brightnessLevel =10
    fun decreaseBrightness(){
        if(brightnessLevel>0){
            brightnessLevel--
        }
        println("Brightness decreased to $brightnessLevel.")
    }
}
class SmartHome{

    val tv= SmartTvDevice("Living Room TV", "Action")
    val light=SmartLightDevice("Bedroom Light", "RGB")

    fun decraeseVolume() {
        if (tv.deviceStatus == "On") {
            tv.decreaseVolume()
        }
    }
    fun changeTvChannelToPrevious() {
        if (tv.deviceStatus == "On")
            tv.previousChannel()
    }
    fun printSmartTvInfo() {
        tv.printDeviceInfo()
    }
    fun printSmartLightInfo() {
        light.printDeviceInfo()
    }
    fun decraeseLightBrightness(){
        if(light.deviceStatus=="On") {
            light.decreaseBrightness()
        }
    }
}