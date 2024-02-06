package lesson_22

enum class DataStatus(val state: String) {
    NO_DATA("Данные отсутствуют"),
    LOADING_DATA("Загрузка данных"),
    DATA_UPLOADED("Данные загружены")
}

class MainScreenViewModel(private var mainScreenState: MainScreenState) {
    data class MainScreenState(var data: String? = null, var isLoading: Boolean = false)
    private val mainScreenStates = mutableListOf<MainScreenState>()
    fun loadData(data: String?, isLoading: Boolean) {
        val previousState = mainScreenState.copy()
        mainScreenStates.add(previousState)
        mainScreenState = MainScreenState(data, isLoading)
        if (mainScreenState.data == null && !mainScreenState.isLoading) println(DataStatus.NO_DATA.state)
        else if (mainScreenState.data == null && mainScreenState.isLoading) println(DataStatus.LOADING_DATA.state)
        else if (mainScreenState.data?.isNotEmpty() == true && !mainScreenState.isLoading) println(DataStatus.DATA_UPLOADED.state)
    }
}

fun main() {
    val mainScreenState = MainScreenViewModel.MainScreenState()
    val mainScreen = MainScreenViewModel(mainScreenState)
    mainScreen.loadData(null, false)
    mainScreen.loadData(null, true)
    mainScreen.loadData("Новые данные", false)
}