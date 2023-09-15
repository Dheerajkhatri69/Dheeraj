var icon = document.getElementById("icon");
icon.onclick = function () {
    var SetTheme = document.body;
    SetTheme.classList.toggle("dark_them");
    icon.classList.toggle("animation_rotat");
    
    var theme;

    if(SetTheme.classList.contains("dark_them")){
        theme = "DARK";
    }else{
        theme = "LIGHT";
    }
    
    localStorage.setItem("PageTheme", JSON.stringify(theme));
    
}
let GetTheme = JSON.parse(localStorage.getItem("PageTheme"));

if(GetTheme === "DARK"){
    document.body.classList = "dark_them";
    icon.classList.toggle("animation_rotat");
}
