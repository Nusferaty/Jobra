var lastOpen;
function collapsElement(id) {
    if ( document.getElementById(id).style.display != "none" ) {
        document.getElementById(id).style.display = 'none';
    }
    else {
        if(lastOpen !== undefined) {
            lastOpen.style.display = 'none';
        }
        lastOpen = document.getElementById(id);
        document.getElementById(id).style.display = '';
    }
}